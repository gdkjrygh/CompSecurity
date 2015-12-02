.class public Lcom/facebook/d/d/o;
.super Lcom/facebook/d/d/j;
.source "SqlQueryBuilder.java"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/d/d/j;-><init>()V

    .line 93
    iput-object p1, p0, Lcom/facebook/d/d/o;->a:Ljava/lang/String;

    .line 94
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/d/d/o;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
