.class Lcom/facebook/orca/prefs/c;
.super Ljava/lang/Object;
.source "GlobalNotificationPrefsSynchronizer.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/prefs/c;->a:Lcom/facebook/orca/prefs/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/prefs/c;->a:Lcom/facebook/orca/prefs/b;

    invoke-static {v0, p2}, Lcom/facebook/orca/prefs/b;->a(Lcom/facebook/orca/prefs/b;Lcom/facebook/prefs/shared/ae;)V

    .line 73
    return-void
.end method
