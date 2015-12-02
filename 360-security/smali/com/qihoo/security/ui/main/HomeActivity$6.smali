.class Lcom/qihoo/security/ui/main/HomeActivity$6;
.super Lcom/qihoo/security/ui/b/a$f;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 269
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$6;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$6;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
