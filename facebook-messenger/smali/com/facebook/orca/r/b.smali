.class public Lcom/facebook/orca/r/b;
.super Lcom/facebook/inject/d;
.source "IsZeroRatingFeatureEnabledProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/config/a/d;

.field private final c:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, "messenger_zero_rating"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/r/b;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/config/a/d;Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/r/b;->b:Lcom/facebook/config/a/d;

    .line 27
    iput-object p2, p0, Lcom/facebook/orca/r/b;->c:Lcom/facebook/prefs/shared/d;

    .line 28
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 32
    iget-object v1, p0, Lcom/facebook/orca/r/b;->b:Lcom/facebook/config/a/d;

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/r/b;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/r/b;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/facebook/orca/r/b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
