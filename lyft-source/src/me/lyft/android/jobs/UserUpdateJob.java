// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.crashlytics.android.Crashlytics;
import java.util.Collections;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.User;
import me.lyft.android.domain.UserMapper;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.driver.VehicleMapper;
import me.lyft.android.domain.payment.ChargeAccountMapper;
import me.lyft.android.domain.payment.CreditMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UserUpdateJob
    implements Job
{

    private final AppStateDTO appStateDTO;
    IChargeAccountsProvider chargeAccountsProvider;
    IUserProvider userProvider;
    IVehicleProvider vehicleProvider;

    public UserUpdateJob(AppStateDTO appstatedto)
    {
        appStateDTO = appstatedto;
    }

    private void updateCrashlyticsData(User user)
    {
        Crashlytics.a("user_mode", user.getMode().toString());
    }

    public void execute()
    {
        if (appStateDTO == null)
        {
            return;
        }
        Object obj = (UserDTO)Objects.firstNonNull(appStateDTO.getUser(), NullUserDTO.getInstance());
        java.util.List list;
        Vehicle vehicle;
        User user;
        if (!((UserDTO) (obj)).isNull())
        {
            user = UserMapper.fromUserDTO(((UserDTO) (obj)));
            vehicle = VehicleMapper.fromVehicleDTO(((UserDTO) (obj)).getVehicle());
            list = ChargeAccountMapper.fromChargeAccountDTO(((UserDTO) (obj)).getChargeAccounts());
            obj = CreditMapper.fromCreditDTO(((UserDTO) (obj)).getCredits());
        } else
        {
            user = User.empty();
            vehicle = Vehicle.empty();
            list = Collections.emptyList();
            obj = Collections.emptyList();
        }
        userProvider.updateUser(user);
        vehicleProvider.updateVehicle(vehicle);
        chargeAccountsProvider.updateChargeAccounts(list);
        chargeAccountsProvider.updateCredits(((java.util.List) (obj)));
        updateCrashlyticsData(user);
    }
}
