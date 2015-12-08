.class public abstract Lcom/c/b/as$d;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/as$d$a;
    }
.end annotation


# instance fields
.field private final c:Lcom/c/b/ar;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 703
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 704
    invoke-static {}, Lcom/c/b/ar;->a()Lcom/c/b/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    .line 705
    return-void
.end method

.method protected constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    .line 709
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 710
    invoke-static {p1}, Lcom/c/b/as$c;->a(Lcom/c/b/as$c;)Lcom/c/b/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    .line 711
    return-void
.end method

.method static synthetic a(Lcom/c/b/as$d;)Lcom/c/b/ar;
    .locals 1

    .prologue
    .line 696
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    return-object v0
.end method

.method private c(Lcom/c/b/ak$f;)V
    .locals 2

    .prologue
    .line 962
    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/c/b/as$d;->e()Lcom/c/b/ak$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 963
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 966
    :cond_0
    return-void
.end method


# virtual methods
.method public final K()Ljava/util/Map;
    .locals 2

    .prologue
    .line 903
    invoke-static {p0}, Lcom/c/b/as;->a(Lcom/c/b/as;)Ljava/util/Map;

    move-result-object v0

    .line 905
    iget-object v1, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v1}, Lcom/c/b/ar;->f()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 906
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final L()V
    .locals 1

    .prologue
    .line 813
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->c()V

    .line 814
    return-void
.end method

.method protected final M()Z
    .locals 1

    .prologue
    .line 788
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->h()Z

    move-result v0

    return v0
.end method

.method protected final N()Lcom/c/b/as$d$a;
    .locals 2

    .prologue
    .line 872
    new-instance v0, Lcom/c/b/as$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/as$d$a;-><init>(Lcom/c/b/as$d;B)V

    return-object v0
.end method

.method protected final O()I
    .locals 1

    .prologue
    .line 880
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->i()I

    move-result v0

    return v0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 793
    invoke-super {p0}, Lcom/c/b/as;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 911
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 912
    invoke-direct {p0, p1}, Lcom/c/b/as$d;->c(Lcom/c/b/ak$f;)V

    .line 913
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;)Z

    move-result v0

    .line 915
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as;->a(Lcom/c/b/ak$f;)Z

    move-result v0

    goto :goto_0
.end method

.method protected final a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z
    .locals 6

    .prologue
    .line 802
    invoke-virtual {p0}, Lcom/c/b/as$d;->e()Lcom/c/b/ak$a;

    move-result-object v3

    new-instance v4, Lcom/c/b/bh$b;

    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-direct {v4, v0}, Lcom/c/b/bh$b;-><init>(Lcom/c/b/ar;)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/c/b/bh;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;Lcom/c/b/ak$a;Lcom/c/b/bh$c;I)Z

    move-result v0

    return v0
.end method

.method public final b(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 921
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 922
    invoke-direct {p0, p1}, Lcom/c/b/as$d;->c(Lcom/c/b/ak$f;)V

    .line 923
    iget-object v0, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v0

    .line 924
    if-nez v0, :cond_0

    .line 925
    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_1

    .line 928
    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/al;->a(Lcom/c/b/ak$a;)Lcom/c/b/al;

    move-result-object v0

    .line 936
    :cond_0
    :goto_0
    return-object v0

    .line 930
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->r()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 936
    :cond_2
    invoke-super {p0, p1}, Lcom/c/b/as;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final d_()Ljava/util/Map;
    .locals 2

    .prologue
    .line 895
    invoke-static {p0}, Lcom/c/b/as;->a(Lcom/c/b/as;)Ljava/util/Map;

    move-result-object v0

    .line 897
    iget-object v1, p0, Lcom/c/b/as$d;->c:Lcom/c/b/ar;

    invoke-virtual {v1}, Lcom/c/b/ar;->f()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 898
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
