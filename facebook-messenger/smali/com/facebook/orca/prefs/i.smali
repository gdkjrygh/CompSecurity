.class public Lcom/facebook/orca/prefs/i;
.super Ljava/lang/Object;
.source "IsMobileOnlineAvailabilityPermittedProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
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
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/orca/prefs/i;->a:Lcom/facebook/l/k;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/prefs/i;->a:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/i;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
