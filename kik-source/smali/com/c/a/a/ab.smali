.class public final Lcom/c/a/a/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/a/ab$a;,
        Lcom/c/a/a/ab$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/c/a/a/c;

.field private final b:Z

.field private final c:Lcom/c/a/a/ab$b;

.field private final d:I


# direct methods
.method private constructor <init>(Lcom/c/a/a/ab$b;)V
    .locals 1

    .prologue
    .line 110
    sget-object v0, Lcom/c/a/a/c;->m:Lcom/c/a/a/c;

    invoke-direct {p0, p1, v0}, Lcom/c/a/a/ab;-><init>(Lcom/c/a/a/ab$b;Lcom/c/a/a/c;)V

    .line 111
    return-void
.end method

.method private constructor <init>(Lcom/c/a/a/ab$b;Lcom/c/a/a/c;)V
    .locals 1

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Lcom/c/a/a/ab;->c:Lcom/c/a/a/ab$b;

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/a/a/ab;->b:Z

    .line 117
    iput-object p2, p0, Lcom/c/a/a/ab;->a:Lcom/c/a/a/c;

    .line 118
    const v0, 0x7fffffff

    iput v0, p0, Lcom/c/a/a/ab;->d:I

    .line 119
    return-void
.end method

.method public static a()Lcom/c/a/a/ab;
    .locals 3

    .prologue
    .line 130
    const/16 v0, 0x2e

    invoke-static {v0}, Lcom/c/a/a/c;->a(C)Lcom/c/a/a/c;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/c/a/a/ab;

    new-instance v2, Lcom/c/a/a/ac;

    invoke-direct {v2, v0}, Lcom/c/a/a/ac;-><init>(Lcom/c/a/a/c;)V

    invoke-direct {v1, v2}, Lcom/c/a/a/ab;-><init>(Lcom/c/a/a/ab$b;)V

    return-object v1
.end method

.method static synthetic a(Lcom/c/a/a/ab;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/c/a/a/ab;->a:Lcom/c/a/a/c;

    return-object v0
.end method

.method static synthetic a(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/c/a/a/ab;->c:Lcom/c/a/a/ab$b;

    invoke-interface {v0, p0, p1}, Lcom/c/a/a/ab$b;->a(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/c/a/a/ab;)Z
    .locals 1

    .prologue
    .line 103
    iget-boolean v0, p0, Lcom/c/a/a/ab;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/c/a/a/ab;)I
    .locals 1

    .prologue
    .line 103
    iget v0, p0, Lcom/c/a/a/ab;->d:I

    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    .prologue
    .line 386
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    new-instance v0, Lcom/c/a/a/ae;

    invoke-direct {v0, p0, p1}, Lcom/c/a/a/ae;-><init>(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)V

    return-object v0
.end method
