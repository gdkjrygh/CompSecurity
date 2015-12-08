.class final Lcom/c/b/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/c/b/h;

.field private final b:[B


# direct methods
.method private constructor <init>(I)V
    .locals 1

    .prologue
    .line 993
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 994
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/c/b/f$b;->b:[B

    .line 995
    iget-object v0, p0, Lcom/c/b/f$b;->b:[B

    invoke-static {v0}, Lcom/c/b/h;->a([B)Lcom/c/b/h;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/f$b;->a:Lcom/c/b/h;

    .line 996
    return-void
.end method

.method synthetic constructor <init>(IB)V
    .locals 0

    .prologue
    .line 989
    invoke-direct {p0, p1}, Lcom/c/b/f$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 999
    iget-object v0, p0, Lcom/c/b/f$b;->a:Lcom/c/b/h;

    invoke-virtual {v0}, Lcom/c/b/h;->c()V

    .line 1004
    new-instance v0, Lcom/c/b/ba;

    iget-object v1, p0, Lcom/c/b/f$b;->b:[B

    invoke-direct {v0, v1}, Lcom/c/b/ba;-><init>([B)V

    return-object v0
.end method

.method public final b()Lcom/c/b/h;
    .locals 1

    .prologue
    .line 1008
    iget-object v0, p0, Lcom/c/b/f$b;->a:Lcom/c/b/h;

    return-object v0
.end method
