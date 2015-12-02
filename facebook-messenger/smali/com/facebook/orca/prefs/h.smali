.class public Lcom/facebook/orca/prefs/h;
.super Ljava/lang/Object;
.source "IsMobileOnlineAvailabilityEnabledProvider.java"

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
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/prefs/h;->a:Lcom/facebook/l/k;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/prefs/h;->a:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
