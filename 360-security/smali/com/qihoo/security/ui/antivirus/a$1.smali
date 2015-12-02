.class Lcom/qihoo/security/ui/antivirus/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/a;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/a$1;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/a$1;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/a;->a(Lcom/qihoo/security/ui/antivirus/a;)Z

    move-result v0

    if-eq v0, p2, :cond_0

    .line 43
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/a$1;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/antivirus/a;->a(Lcom/qihoo/security/ui/antivirus/a;Z)Z

    .line 46
    :cond_0
    return-void
.end method
