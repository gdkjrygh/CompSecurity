.class Lcom/facebook/orca/contacts/divebar/j;
.super Landroid/content/BroadcastReceiver;
.source "DivebarContactsUploaderController.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/h;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/h;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/j;->a:Lcom/facebook/orca/contacts/divebar/h;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/j;->a:Lcom/facebook/orca/contacts/divebar/h;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/j;->a:Lcom/facebook/orca/contacts/divebar/h;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/h;->a(Lcom/facebook/orca/contacts/divebar/h;)V

    .line 101
    :cond_0
    return-void
.end method
