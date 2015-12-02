.class public final Lcom/mobvista/sdk/m/core/m;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/l;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/l;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/m;->a:Lcom/mobvista/sdk/m/core/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/m;->b:Ljava/lang/String;

    .line 24
    iput-boolean p3, p0, Lcom/mobvista/sdk/m/core/m;->c:Z

    .line 25
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/m;->b:Ljava/lang/String;

    return-object v0
.end method
