// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.content.Intent;

public class ChromiumLinkerParams
{

    private static final String EXTRA_LINKER_PARAMS_BASE_LOAD_ADDRESS = "org.chromium.content.common.linker_params.base_load_address";
    private static final String EXTRA_LINKER_PARAMS_TEST_RUNNER_CLASS_NAME = "org.chromium.content.common.linker_params.test_runner_class_name";
    private static final String EXTRA_LINKER_PARAMS_WAIT_FOR_SHARED_RELRO = "org.chromium.content.common.linker_params.wait_for_shared_relro";
    public final long mBaseLoadAddress;
    public final String mTestRunnerClassName;
    public final boolean mWaitForSharedRelro;

    public ChromiumLinkerParams(long l, boolean flag, String s)
    {
        mBaseLoadAddress = l;
        mWaitForSharedRelro = flag;
        mTestRunnerClassName = s;
    }

    public ChromiumLinkerParams(Intent intent)
    {
        mBaseLoadAddress = intent.getLongExtra("org.chromium.content.common.linker_params.base_load_address", 0L);
        mWaitForSharedRelro = intent.getBooleanExtra("org.chromium.content.common.linker_params.wait_for_shared_relro", false);
        mTestRunnerClassName = intent.getStringExtra("org.chromium.content.common.linker_params.test_runner_class_name");
    }

    public void addIntentExtras(Intent intent)
    {
        intent.putExtra("org.chromium.content.common.linker_params.base_load_address", mBaseLoadAddress);
        intent.putExtra("org.chromium.content.common.linker_params.wait_for_shared_relro", mWaitForSharedRelro);
        intent.putExtra("org.chromium.content.common.linker_params.test_runner_class_name", mTestRunnerClassName);
    }

    public String toString()
    {
        long l = mBaseLoadAddress;
        String s;
        if (mWaitForSharedRelro)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        return String.format("LinkerParams(baseLoadAddress:0x%x, waitForSharedRelro:%s, testRunnerClassName:%s", new Object[] {
            Long.valueOf(l), s, mTestRunnerClassName
        });
    }
}
