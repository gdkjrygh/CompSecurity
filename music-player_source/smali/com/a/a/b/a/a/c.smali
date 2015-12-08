.class public final Lcom/a/a/b/a/a/c;
.super Lcom/a/a/b/a/a/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/a/a/b/a/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    invoke-super {p0, p1}, Lcom/a/a/b/a/a/d;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final remove()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/a/a/b/a/a/d;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
