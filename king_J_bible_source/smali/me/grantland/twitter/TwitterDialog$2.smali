.class Lme/grantland/twitter/TwitterDialog$2;
.super Ljava/lang/Object;
.source "TwitterDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterDialog;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterDialog$2;->this$0:Lme/grantland/twitter/TwitterDialog;

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 135
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog$2;->this$0:Lme/grantland/twitter/TwitterDialog;

    invoke-virtual {v0}, Lme/grantland/twitter/TwitterDialog;->cancel()V

    .line 136
    return-void
.end method
