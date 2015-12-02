.class public final enum Lcom/qihoo/security/ui/fragment/utils/FragmentAction;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/fragment/utils/FragmentAction;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACTION_DRAWER_CLOSE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum ACTION_DRAWER_OPEN:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum CLEAN_ACTION_UPDATE_COLOR:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum ChangeTab:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum GOOGLE_PLUS_LOGIN_FAILED:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum GOOGLE_PLUS_LOGIN_SUCCESS:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum LOCK_SCREEN_SAVING:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum REFRESH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum RESULT_ACTION_SKIP_DRAWER:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum RESULT_ACTION_SKIP_SUB_MODULE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum SYSTEM_APP_UNINSTALL_CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field public static final enum SYSTEM_APP_UNINSTALL_CONFIRM:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field private static final synthetic a:[Lcom/qihoo/security/ui/fragment/utils/FragmentAction;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 15
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "GOOGLE_PLUS_LOGIN_SUCCESS"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->GOOGLE_PLUS_LOGIN_SUCCESS:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 17
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "GOOGLE_PLUS_LOGIN_FAILED"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->GOOGLE_PLUS_LOGIN_FAILED:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 20
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "LOCK_SCREEN_SAVING"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->LOCK_SCREEN_SAVING:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 23
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "SYSTEM_APP_UNINSTALL_CONFIRM"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->SYSTEM_APP_UNINSTALL_CONFIRM:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 25
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "SYSTEM_APP_UNINSTALL_CANCLE"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->SYSTEM_APP_UNINSTALL_CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 28
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "CANCLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 30
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "REFRESH"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->REFRESH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 33
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "ACTION_DRAWER_OPEN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ACTION_DRAWER_OPEN:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 35
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "ACTION_DRAWER_CLOSE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ACTION_DRAWER_CLOSE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 38
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "RESULT_ACTION_FINISH"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 40
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "RESULT_ACTION_SWITCH_TAB"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 42
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "RESULT_ACTION_SKIP_SUB_MODULE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SKIP_SUB_MODULE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 44
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "RESULT_ACTION_SKIP_DRAWER"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SKIP_DRAWER:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 46
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "CLEAN_ACTION_UPDATE_COLOR"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->CLEAN_ACTION_UPDATE_COLOR:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 51
    new-instance v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const-string/jumbo v1, "ChangeTab"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ChangeTab:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    .line 12
    const/16 v0, 0xf

    new-array v0, v0, [Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->GOOGLE_PLUS_LOGIN_SUCCESS:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->GOOGLE_PLUS_LOGIN_FAILED:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->LOCK_SCREEN_SAVING:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->SYSTEM_APP_UNINSTALL_CONFIRM:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->SYSTEM_APP_UNINSTALL_CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->CANCLE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->REFRESH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ACTION_DRAWER_OPEN:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ACTION_DRAWER_CLOSE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SKIP_SUB_MODULE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SKIP_DRAWER:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->CLEAN_ACTION_UPDATE_COLOR:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ChangeTab:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->a:[Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/fragment/utils/FragmentAction;
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/fragment/utils/FragmentAction;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->a:[Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    return-object v0
.end method
