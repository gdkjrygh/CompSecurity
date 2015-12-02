.class public Lcom/qihoo/security/v5/UpdateHelper;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v5/UpdateHelper$4;,
        Lcom/qihoo/security/v5/UpdateHelper$UpdateType;
    }
.end annotation


# static fields
.field public static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/v5/UpdateHelper;->a:Z

    return-void
.end method

.method private static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 87
    invoke-static {p0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    .line 88
    if-nez v0, :cond_0

    .line 95
    :goto_0
    return-void

    .line 91
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    const-string/jumbo v1, "type"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 94
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 98
    if-nez p0, :cond_0

    .line 113
    :goto_0
    return-void

    .line 102
    :cond_0
    invoke-static {p0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    .line 104
    if-nez v0, :cond_1

    .line 105
    invoke-static {p0}, Lcom/qihoo/security/v5/UpdateHelper;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 109
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 110
    const-string/jumbo v1, "type"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 111
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 112
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lcom/qihoo/security/v5/UpdateHelper$UpdateType;)V
    .locals 4

    .prologue
    const v3, 0x7f0c018a

    const/16 v2, 0xbba

    .line 54
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/v5/UpdateHelper;->a:Z

    .line 55
    sget-object v0, Lcom/qihoo/security/v5/UpdateHelper$4;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 84
    :goto_0
    return-void

    .line 57
    :pswitch_0
    const/16 v0, 0x4a40

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 58
    const/16 v0, 0x6979

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 59
    const/16 v0, 0xbb9

    invoke-static {p0, v0}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 62
    :pswitch_1
    invoke-static {p0}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 66
    :pswitch_2
    const/16 v0, 0x697c

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 67
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 71
    :cond_0
    invoke-static {p0, v2}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 74
    :pswitch_3
    const/16 v0, 0x697b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 75
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 79
    :cond_1
    invoke-static {p0, v2}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static b(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 116
    new-instance v0, Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0c00c4

    const v2, 0x7f0c00c5

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;II)V

    .line 118
    new-array v1, v3, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 119
    new-array v1, v3, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/v5/UpdateHelper$1;

    invoke-direct {v3, p0, v0}, Lcom/qihoo/security/v5/UpdateHelper$1;-><init>(Landroid/content/Context;Lcom/qihoo/security/dialog/b;)V

    aput-object v3, v1, v2

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/v5/UpdateHelper$2;

    invoke-direct {v3, v0}, Lcom/qihoo/security/v5/UpdateHelper$2;-><init>(Lcom/qihoo/security/dialog/b;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 134
    new-instance v1, Lcom/qihoo/security/v5/UpdateHelper$3;

    invoke-direct {v1, v0}, Lcom/qihoo/security/v5/UpdateHelper$3;-><init>(Lcom/qihoo/security/dialog/b;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 144
    const/16 v1, 0x697d

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    .line 145
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    .line 146
    return-void

    .line 118
    :array_0
    .array-data 4
        0x7f0c01d1
        0x7f0c014f
    .end array-data
.end method
