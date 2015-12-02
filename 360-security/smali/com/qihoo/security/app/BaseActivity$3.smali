.class Lcom/qihoo/security/app/BaseActivity$3;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/app/BaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/app/BaseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/BaseActivity;)V
    .locals 0

    .prologue
    .line 512
    iput-object p1, p0, Lcom/qihoo/security/app/BaseActivity$3;->a:Lcom/qihoo/security/app/BaseActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 515
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity$3;->a:Lcom/qihoo/security/app/BaseActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 516
    return-void
.end method
