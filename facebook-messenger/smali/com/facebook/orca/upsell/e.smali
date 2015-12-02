.class public Lcom/facebook/orca/upsell/e;
.super Ljava/lang/Object;
.source "WillShowInstallMessengerChatHeadPromoProvider.java"

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
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/common/time/a;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;Ljavax/inject/a;)V
    .locals 0
    .param p3    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/annotations/IsInstallMessengerChatHeadPromoEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/common/time/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/orca/upsell/e;->a:Lcom/facebook/prefs/shared/d;

    .line 32
    iput-object p2, p0, Lcom/facebook/orca/upsell/e;->b:Lcom/facebook/common/time/a;

    .line 33
    iput-object p3, p0, Lcom/facebook/orca/upsell/e;->c:Ljavax/inject/a;

    .line 34
    return-void
.end method

.method private c()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 46
    iget-object v1, p0, Lcom/facebook/orca/upsell/e;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/upsell/d;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 49
    const/16 v2, 0xa

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private d()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 53
    iget-object v1, p0, Lcom/facebook/orca/upsell/e;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/upsell/d;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 56
    iget-object v2, p0, Lcom/facebook/orca/upsell/e;->a:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/upsell/d;->d:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    .line 59
    iget-object v4, p0, Lcom/facebook/orca/upsell/e;->b:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 60
    const-wide/32 v4, 0x5265c00

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private e()Z
    .locals 4

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/upsell/e;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/upsell/d;->e:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 69
    iget-object v2, p0, Lcom/facebook/orca/upsell/e;->b:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 70
    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/upsell/e;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/upsell/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/upsell/e;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/upsell/e;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/facebook/orca/upsell/e;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
