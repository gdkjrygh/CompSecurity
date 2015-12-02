.class public Lcom/facebook/orca/activity/l;
.super Ljava/lang/Object;
.source "MessengerAboutHandler.java"

# interfaces
.implements Lcom/facebook/orca/prefs/a;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/activity/l;->a:Landroid/content/Context;

    .line 20
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 24
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/activity/l;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    iget-object v1, p0, Lcom/facebook/orca/activity/l;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 26
    return-void
.end method
