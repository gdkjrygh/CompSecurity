.class Lme/grantland/twitter/TwitterActivity$1;
.super Ljava/lang/Object;
.source "TwitterActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterActivity;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterActivity$1;->this$0:Lme/grantland/twitter/TwitterActivity;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 91
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity$1;->this$0:Lme/grantland/twitter/TwitterActivity;

    # invokes: Lme/grantland/twitter/TwitterActivity;->cancel()V
    invoke-static {v0}, Lme/grantland/twitter/TwitterActivity;->access$1(Lme/grantland/twitter/TwitterActivity;)V

    .line 92
    return-void
.end method
