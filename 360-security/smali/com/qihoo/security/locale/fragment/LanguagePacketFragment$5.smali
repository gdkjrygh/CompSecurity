.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    check-cast p2, Lcom/qihoo/security/v5/UpdateService$a;

    invoke-virtual {p2}, Lcom/qihoo/security/v5/UpdateService$a;->a()Lcom/qihoo/security/v5/UpdateService;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/UpdateService;

    .line 132
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/b;)V

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/UpdateService;

    .line 143
    :cond_0
    return-void
.end method
