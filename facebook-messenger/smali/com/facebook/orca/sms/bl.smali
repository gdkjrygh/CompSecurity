.class public Lcom/facebook/orca/sms/bl;
.super Ljava/lang/Object;
.source "MmsTransactionCompletedAction.java"

# interfaces
.implements Lcom/facebook/c/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 0

    .prologue
    .line 16
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 17
    invoke-static {p1, p2}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 18
    return-void
.end method
