.class final Lcom/a/a/b/a/a/f;
.super Lcom/a/a/b/a/a/e;


# instance fields
.field final synthetic d:Lcom/a/a/b/a/a/d;


# direct methods
.method private constructor <init>(Lcom/a/a/b/a/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/a/a/f;->d:Lcom/a/a/b/a/a/d;

    invoke-direct {p0, p1}, Lcom/a/a/b/a/a/e;-><init>(Lcom/a/a/b/a/a/d;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/a/a/b/a/a/d;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/a/a/b/a/a/f;-><init>(Lcom/a/a/b/a/a/d;)V

    return-void
.end method


# virtual methods
.method final a()Lcom/a/a/b/a/a/g;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/a/a/f;->d:Lcom/a/a/b/a/a/d;

    iget-object v0, v0, Lcom/a/a/b/a/a/d;->a:Lcom/a/a/b/a/a/g;

    return-object v0
.end method

.method final a(Lcom/a/a/b/a/a/g;)Lcom/a/a/b/a/a/g;
    .locals 1

    iget-object v0, p1, Lcom/a/a/b/a/a/g;->c:Lcom/a/a/b/a/a/g;

    return-object v0
.end method
