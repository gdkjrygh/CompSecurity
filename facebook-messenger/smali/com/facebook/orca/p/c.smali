.class Lcom/facebook/orca/p/c;
.super Lcom/facebook/l/u;
.source "CanonicalThreadPresenceHelper.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/p/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/p/b;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/orca/p/c;->a:Lcom/facebook/orca/p/b;

    invoke-direct {p0}, Lcom/facebook/l/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/p/c;->a:Lcom/facebook/orca/p/b;

    invoke-static {v0, p1, p2}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/p/b;Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V

    .line 79
    return-void
.end method
