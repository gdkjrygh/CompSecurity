.class public final Lcom/google/a/b/a/m;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/a/an;


# instance fields
.field private final b:Lcom/google/a/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    new-instance v0, Lcom/google/a/b/a/n;

    invoke-direct {v0}, Lcom/google/a/b/a/n;-><init>()V

    sput-object v0, Lcom/google/a/b/a/m;->a:Lcom/google/a/an;

    return-void
.end method

.method private constructor <init>(Lcom/google/a/k;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/google/a/b/a/m;->b:Lcom/google/a/k;

    .line 51
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/a/k;B)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/google/a/b/a/m;-><init>(Lcom/google/a/k;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 54
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    .line 55
    sget-object v1, Lcom/google/a/b/a/o;->a:[I

    invoke-virtual {v0}, Lcom/google/a/d/e;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 88
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 57
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {p1}, Lcom/google/a/d/a;->a()V

    .line 59
    :goto_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    invoke-virtual {p0, p1}, Lcom/google/a/b/a/m;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->b()V

    .line 85
    :goto_1
    return-object v0

    .line 66
    :pswitch_1
    new-instance v0, Lcom/google/a/b/v;

    invoke-direct {v0}, Lcom/google/a/b/v;-><init>()V

    .line 67
    invoke-virtual {p1}, Lcom/google/a/d/a;->c()V

    .line 68
    :goto_2
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 69
    invoke-virtual {p1}, Lcom/google/a/d/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/google/a/b/a/m;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 71
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->d()V

    goto :goto_1

    .line 75
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 78
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/a/d/a;->k()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1

    .line 81
    :pswitch_4
    invoke-virtual {p1}, Lcom/google/a/d/a;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    .line 84
    :pswitch_5
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 85
    const/4 v0, 0x0

    goto :goto_1

    .line 55
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 93
    if-nez p2, :cond_0

    .line 94
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 106
    :goto_0
    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/google/a/b/a/m;->b:Lcom/google/a/k;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/a/k;->a(Ljava/lang/Class;)Lcom/google/a/am;

    move-result-object v0

    .line 99
    instance-of v1, v0, Lcom/google/a/b/a/m;

    if-eqz v1, :cond_1

    .line 100
    invoke-virtual {p1}, Lcom/google/a/d/f;->d()Lcom/google/a/d/f;

    .line 101
    invoke-virtual {p1}, Lcom/google/a/d/f;->e()Lcom/google/a/d/f;

    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    goto :goto_0
.end method
