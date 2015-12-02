.class Lcom/facebook/orca/app/e;
.super Ljava/lang/Object;
.source "LoginReminderManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private a:Lcom/facebook/orca/app/LoginReminderManager;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 238
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 239
    const-class v1, Lcom/facebook/orca/app/LoginReminderManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/LoginReminderManager;

    iput-object v0, p0, Lcom/facebook/orca/app/e;->a:Lcom/facebook/orca/app/LoginReminderManager;

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/app/e;->a:Lcom/facebook/orca/app/LoginReminderManager;

    invoke-static {v0}, Lcom/facebook/orca/app/LoginReminderManager;->a(Lcom/facebook/orca/app/LoginReminderManager;)V

    .line 242
    return-void
.end method
