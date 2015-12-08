.class public Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/IUserManager;


# static fields
.field private static mInstance:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->mInstance:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getInstance(Landroid/content/Context;)Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->mInstance:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    invoke-direct {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->mInstance:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    .line 26
    :cond_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->mInstance:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    return-object v0
.end method


# virtual methods
.method public allLogout(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 278
    if-nez p3, :cond_0

    .line 279
    const/4 v0, 0x0

    .line 320
    :goto_0
    return-object v0

    .line 281
    :cond_0
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 283
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/q;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newRevokeRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 318
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 320
    const/4 v0, 0x0

    aget-object v0, v6, v0

    goto :goto_0
.end method

.method public allUpAvatar(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 8

    .prologue
    .line 326
    if-nez p3, :cond_0

    .line 327
    const/4 v0, 0x0

    .line 368
    :goto_0
    return-object v0

    .line 329
    :cond_0
    const/4 v0, 0x1

    new-array v7, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 331
    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/r;

    invoke-direct {v6, p0, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/r;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newUpAvatarRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 366
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 368
    const/4 v0, 0x0

    aget-object v0, v7, v0

    goto :goto_0
.end method

.method public allUpNickname(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 8

    .prologue
    .line 373
    if-nez p3, :cond_0

    .line 374
    const/4 v0, 0x0

    .line 415
    :goto_0
    return-object v0

    .line 376
    :cond_0
    const/4 v0, 0x1

    new-array v7, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 378
    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/s;

    invoke-direct {v6, p0, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/s;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newUpNicknameRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpNicknameCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 413
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 415
    const/4 v0, 0x0

    aget-object v0, v7, v0

    goto :goto_0
.end method

.method public allUserinfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 560
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 562
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/d;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/d;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newUserinfoRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUserinfoCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 597
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 599
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0
.end method

.method public cmCmbToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 12

    .prologue
    .line 702
    const/4 v0, 0x1

    new-array v11, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 704
    const/4 v7, 0x0

    new-instance v10, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/g;

    invoke-direct {v10, p0, v11}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/g;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-static/range {v0 .. v10}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newCmbTokenRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCmbTokenCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 740
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 742
    const/4 v0, 0x0

    aget-object v0, v11, v0

    return-object v0
.end method

.method public cmCmbTokenWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 12

    .prologue
    .line 749
    const/4 v0, 0x1

    new-array v11, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 751
    const/4 v7, 0x1

    new-instance v10, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/h;

    invoke-direct {v10, p0, v11}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/h;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-static/range {v0 .. v10}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newCmbTokenRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCmbTokenCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 786
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 788
    const/4 v0, 0x0

    aget-object v0, v11, v0

    return-object v0
.end method

.method public cmEmailActive(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 8

    .prologue
    .line 926
    const/4 v0, 0x1

    new-array v7, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 928
    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/m;

    invoke-direct {v6, p0, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/m;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newEmailActiveRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 963
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 965
    const/4 v0, 0x0

    aget-object v0, v7, v0

    return-object v0
.end method

.method public cmFindPasswordByMail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 469
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 471
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/b;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/b;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newForgetRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyForgetCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 506
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 508
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0
.end method

.method public cmIsAccountExist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 838
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 840
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/j;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/j;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newIsExistRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyIsExistCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 875
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 877
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0
.end method

.method public cmLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 10

    .prologue
    .line 122
    const/4 v0, 0x1

    new-array v9, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 124
    const/4 v5, 0x0

    new-instance v8, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/n;

    invoke-direct {v8, p0, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/n;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginLoginCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 160
    const/4 v0, 0x0

    aget-object v0, v9, v0

    return-object v0
.end method

.method public cmLoginWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 10

    .prologue
    .line 167
    const/4 v0, 0x1

    new-array v9, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 169
    const/4 v5, 0x1

    new-instance v8, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/o;

    invoke-direct {v8, p0, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/o;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginLoginCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 205
    const/4 v0, 0x0

    aget-object v0, v9, v0

    return-object v0
.end method

.method public cmMe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 605
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 607
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/e;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/e;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newMeRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyMeCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 642
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 644
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0
.end method

.method public cmModifyPassword(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 421
    if-nez p3, :cond_0

    .line 422
    const/4 v0, 0x0

    .line 463
    :goto_0
    return-object v0

    .line 424
    :cond_0
    const/4 v0, 0x1

    new-array v8, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 426
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/t;

    invoke-direct {v7, p0, v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/t;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    invoke-static/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newPasswordRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyPasswordCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 461
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 463
    const/4 v0, 0x0

    aget-object v0, v8, v0

    goto :goto_0
.end method

.method public cmReauth(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 651
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 654
    const-string v1, "com.ijinshan.kbackup"

    const-string v2, "c09763c733c26804185642a8c9d8b7a6"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    const/4 v1, 0x1

    new-array v8, v1, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 658
    invoke-interface {v0, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/f;

    invoke-direct {v7, p0, v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/f;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newReauthRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 693
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 695
    const/4 v0, 0x0

    aget-object v0, v8, v0

    return-object v0
.end method

.method public cmRefreshToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 7

    .prologue
    .line 794
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 796
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/i;

    invoke-direct {v5, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/i;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newReFreshRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRefreshCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 831
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 833
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0
.end method

.method public cmRegist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 10

    .prologue
    .line 32
    const/4 v0, 0x1

    new-array v9, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 34
    const/4 v5, 0x0

    new-instance v8, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/a;

    invoke-direct {v8, p0, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/a;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newRegisterRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginRegisterCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 71
    const/4 v0, 0x0

    aget-object v0, v9, v0

    return-object v0
.end method

.method public cmRegistWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 10

    .prologue
    .line 77
    const/4 v0, 0x1

    new-array v9, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 79
    const/4 v5, 0x1

    new-instance v8, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/l;

    invoke-direct {v8, p0, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/l;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-static/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newRegisterRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginRegisterCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 116
    const/4 v0, 0x0

    aget-object v0, v9, v0

    return-object v0
.end method

.method public cmResetPassword(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 515
    const/4 v0, 0x1

    new-array v8, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 517
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/c;

    invoke-direct {v7, p0, v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/c;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    invoke-static/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newResetRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyResetCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 552
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 554
    const/4 v0, 0x0

    aget-object v0, v8, v0

    return-object v0
.end method

.method public cmSendMail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 882
    const/4 v0, 0x1

    new-array v8, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 884
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/k;

    invoke-direct {v7, p0, v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/k;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    invoke-static/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newSendMailRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxySendMailCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 919
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 921
    const/4 v0, 0x0

    aget-object v0, v8, v0

    return-object v0
.end method

.method public googleLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 210
    const-string v5, "104"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    return-object v0
.end method

.method public googleLoginWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 215
    const-string v5, "104"

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    return-object v0
.end method

.method public instagramLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 220
    const-string v5, "110"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    return-object v0
.end method

.method public instagramLoginWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 9

    .prologue
    .line 225
    const-string v5, "110"

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    return-object v0
.end method

.method public thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    .locals 10

    .prologue
    .line 232
    const/4 v0, 0x1

    new-array v9, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    .line 234
    new-instance v8, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/p;

    invoke-direct {v8, p0, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/p;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;[Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newThirdRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginThirdCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    .line 269
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    .line 271
    const/4 v0, 0x0

    aget-object v0, v9, v0

    return-object v0
.end method
