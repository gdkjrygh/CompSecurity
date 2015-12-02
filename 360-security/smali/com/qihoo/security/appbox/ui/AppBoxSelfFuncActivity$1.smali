.class Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$1;
.super Lcom/qihoo/security/ui/b/a$f;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$1;->a:Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;

    invoke-direct {p0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$1;->a:Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
