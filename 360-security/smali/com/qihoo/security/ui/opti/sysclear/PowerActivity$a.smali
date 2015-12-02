.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V
    .locals 0

    .prologue
    .line 2076
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;)V
    .locals 0

    .prologue
    .line 2076
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 2079
    if-eqz p2, :cond_0

    const-string/jumbo v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2080
    const-string/jumbo v0, "level"

    invoke-virtual {p2, v0, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 2081
    const-string/jumbo v1, "scale"

    const/16 v2, 0x64

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 2082
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    mul-int/lit8 v0, v0, 0x64

    div-int/2addr v0, v1

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 2083
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2084
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->v(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0037

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v4}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->u(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 2087
    :cond_0
    return-void
.end method
