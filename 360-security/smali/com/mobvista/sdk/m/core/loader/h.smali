.class public final Lcom/mobvista/sdk/m/core/loader/h;
.super Lcom/mobvista/sdk/m/a/a/c/a;
.source "360Security"


# instance fields
.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/c/a;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/h;->c:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/util/Map;[B)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/h;->c:Ljava/lang/String;

    return-object v0
.end method
