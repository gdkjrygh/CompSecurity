.class public Lcom/facebook/orca/prefs/au;
.super Ljava/lang/Object;
.source "PayForPlayPresenceProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/l/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/l/k;


# direct methods
.method public constructor <init>(Lcom/facebook/l/k;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/prefs/au;->a:Lcom/facebook/l/k;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/l/j;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/prefs/au;->a:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->h()Lcom/facebook/l/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/au;->a()Lcom/facebook/l/j;

    move-result-object v0

    return-object v0
.end method
