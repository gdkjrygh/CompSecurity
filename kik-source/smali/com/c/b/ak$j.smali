.class public final Lcom/c/b/ak$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field private final a:I

.field private b:Lcom/c/b/i$y;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/c/b/ak$g;

.field private e:Lcom/c/b/ak$a;

.field private f:I

.field private g:[Lcom/c/b/ak$f;


# direct methods
.method private constructor <init>(Lcom/c/b/i$y;Lcom/c/b/ak$g;Lcom/c/b/ak$a;I)V
    .locals 1

    .prologue
    .line 2366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2367
    iput-object p1, p0, Lcom/c/b/ak$j;->b:Lcom/c/b/i$y;

    .line 2368
    invoke-virtual {p1}, Lcom/c/b/i$y;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lcom/c/b/ak;->a(Lcom/c/b/ak$g;Lcom/c/b/ak$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$j;->c:Ljava/lang/String;

    .line 2369
    iput-object p2, p0, Lcom/c/b/ak$j;->d:Lcom/c/b/ak$g;

    .line 2370
    iput p4, p0, Lcom/c/b/ak$j;->a:I

    .line 2372
    iput-object p3, p0, Lcom/c/b/ak$j;->e:Lcom/c/b/ak$a;

    .line 2373
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/ak$j;->f:I

    .line 2374
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/i$y;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IB)V
    .locals 0

    .prologue
    .line 2339
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/c/b/ak$j;-><init>(Lcom/c/b/i$y;Lcom/c/b/ak$g;Lcom/c/b/ak$a;I)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$j;)I
    .locals 1

    .prologue
    .line 2339
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/ak$j;->f:I

    return v0
.end method

.method static synthetic a(Lcom/c/b/ak$j;[Lcom/c/b/ak$f;)[Lcom/c/b/ak$f;
    .locals 0

    .prologue
    .line 2339
    iput-object p1, p0, Lcom/c/b/ak$j;->g:[Lcom/c/b/ak$f;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/ak$j;)[Lcom/c/b/ak$f;
    .locals 1

    .prologue
    .line 2339
    iget-object v0, p0, Lcom/c/b/ak$j;->g:[Lcom/c/b/ak$f;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/ak$j;)I
    .locals 2

    .prologue
    .line 2339
    iget v0, p0, Lcom/c/b/ak$j;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/c/b/ak$j;->f:I

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 2341
    iget v0, p0, Lcom/c/b/ak$j;->a:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 2351
    iget v0, p0, Lcom/c/b/ak$j;->f:I

    return v0
.end method
