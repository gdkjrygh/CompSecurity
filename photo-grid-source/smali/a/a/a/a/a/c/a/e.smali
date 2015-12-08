.class public final La/a/a/a/a/c/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:La/a/a/a/a/c/a/a;

.field private final c:La/a/a/a/a/c/a/d;


# direct methods
.method private constructor <init>(ILa/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput p1, p0, La/a/a/a/a/c/a/e;->a:I

    .line 31
    iput-object p2, p0, La/a/a/a/a/c/a/e;->b:La/a/a/a/a/c/a/a;

    .line 32
    iput-object p3, p0, La/a/a/a/a/c/a/e;->c:La/a/a/a/a/c/a/d;

    .line 33
    return-void
.end method

.method public constructor <init>(La/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, La/a/a/a/a/c/a/e;-><init>(ILa/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V

    .line 27
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, La/a/a/a/a/c/a/e;->b:La/a/a/a/a/c/a/a;

    iget v1, p0, La/a/a/a/a/c/a/e;->a:I

    invoke-interface {v0, v1}, La/a/a/a/a/c/a/a;->a(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()La/a/a/a/a/c/a/e;
    .locals 4

    .prologue
    .line 52
    new-instance v0, La/a/a/a/a/c/a/e;

    iget v1, p0, La/a/a/a/a/c/a/e;->a:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, La/a/a/a/a/c/a/e;->b:La/a/a/a/a/c/a/a;

    iget-object v3, p0, La/a/a/a/a/c/a/e;->c:La/a/a/a/a/c/a/d;

    invoke-direct {v0, v1, v2, v3}, La/a/a/a/a/c/a/e;-><init>(ILa/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V

    return-object v0
.end method

.method public final c()La/a/a/a/a/c/a/e;
    .locals 3

    .prologue
    .line 56
    new-instance v0, La/a/a/a/a/c/a/e;

    iget-object v1, p0, La/a/a/a/a/c/a/e;->b:La/a/a/a/a/c/a/a;

    iget-object v2, p0, La/a/a/a/a/c/a/e;->c:La/a/a/a/a/c/a/d;

    invoke-direct {v0, v1, v2}, La/a/a/a/a/c/a/e;-><init>(La/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V

    return-object v0
.end method
