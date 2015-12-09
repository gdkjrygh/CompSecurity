.class public Lcom/EnterpriseMobileBanking/Utils/CallbackTaskLoader;
.super Ljava/lang/Object;
.source "CallbackTaskLoader.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
.end method

.method public static LoadAllTasks()V
    .locals 0

    .prologue
    .line 10
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->load()V

    .line 11
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->load()V

    .line 12
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->load()V

    .line 13
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/linkerSetupCallbackTask;->load()V

    .line 14
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->load()V

    .line 15
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;->load()V

    .line 16
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MinimizeCallbackTask;->load()V

    .line 17
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MoveCallbackTask;->load()V

    .line 18
    return-void
.end method
