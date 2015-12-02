.class public abstract La/d;
.super Ljava/lang/Object;
.source "Delta.java"


# instance fields
.field private a:La/b;

.field private b:La/b;


# direct methods
.method public constructor <init>(La/b;La/b;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, La/d;->a:La/b;

    .line 41
    iput-object p2, p0, La/d;->b:La/b;

    .line 42
    return-void
.end method


# virtual methods
.method public a()La/b;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, La/d;->a:La/b;

    return-object v0
.end method

.method public b()La/b;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, La/d;->b:La/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 123
    if-ne p0, p1, :cond_1

    .line 140
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 126
    goto :goto_0

    .line 127
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 128
    goto :goto_0

    .line 129
    :cond_3
    check-cast p1, La/d;

    .line 130
    iget-object v2, p0, La/d;->a:La/b;

    if-nez v2, :cond_4

    .line 131
    iget-object v2, p1, La/d;->a:La/b;

    if-eqz v2, :cond_5

    move v0, v1

    .line 132
    goto :goto_0

    .line 133
    :cond_4
    iget-object v2, p0, La/d;->a:La/b;

    iget-object v3, p1, La/d;->a:La/b;

    invoke-virtual {v2, v3}, La/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 134
    goto :goto_0

    .line 135
    :cond_5
    iget-object v2, p0, La/d;->b:La/b;

    if-nez v2, :cond_6

    .line 136
    iget-object v2, p1, La/d;->b:La/b;

    if-eqz v2, :cond_0

    move v0, v1

    .line 137
    goto :goto_0

    .line 138
    :cond_6
    iget-object v2, p0, La/d;->b:La/b;

    iget-object v3, p1, La/d;->b:La/b;

    invoke-virtual {v2, v3}, La/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 139
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 109
    .line 111
    iget-object v0, p0, La/d;->a:La/b;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 112
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, La/d;->b:La/b;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    .line 113
    return v0

    .line 111
    :cond_0
    iget-object v0, p0, La/d;->a:La/b;

    invoke-virtual {v0}, La/b;->hashCode()I

    move-result v0

    goto :goto_0

    .line 112
    :cond_1
    iget-object v1, p0, La/d;->b:La/b;

    invoke-virtual {v1}, La/b;->hashCode()I

    move-result v1

    goto :goto_1
.end method
