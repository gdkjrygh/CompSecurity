.class public final Lcom/c/b/cd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/cd$1;,
        Lcom/c/b/cd$c;,
        Lcom/c/b/cd$a;,
        Lcom/c/b/cd$b;
    }
.end annotation


# static fields
.field static final a:I

.field static final b:I

.field static final c:I

.field static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 157
    const/16 v0, 0xb

    sput v0, Lcom/c/b/cd;->a:I

    .line 159
    const/16 v0, 0xc

    sput v0, Lcom/c/b/cd;->b:I

    .line 161
    const/16 v0, 0x10

    sput v0, Lcom/c/b/cd;->c:I

    .line 163
    const/16 v0, 0x1a

    sput v0, Lcom/c/b/cd;->d:I

    return-void
.end method

.method static a(I)I
    .locals 1

    .prologue
    .line 62
    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method static a(II)I
    .locals 1

    .prologue
    .line 72
    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method

.method static a(Lcom/c/b/g;Lcom/c/b/cd$a;Lcom/c/b/cd$c;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 212
    sget-object v0, Lcom/c/b/cd$1;->a:[I

    invoke-virtual {p1}, Lcom/c/b/cd$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 242
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 213
    :pswitch_0
    invoke-virtual {p0}, Lcom/c/b/g;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 228
    :goto_0
    return-object v0

    .line 214
    :pswitch_1
    invoke-virtual {p0}, Lcom/c/b/g;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    .line 215
    :pswitch_2
    invoke-virtual {p0}, Lcom/c/b/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 216
    :pswitch_3
    invoke-virtual {p0}, Lcom/c/b/g;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 217
    :pswitch_4
    invoke-virtual {p0}, Lcom/c/b/g;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 218
    :pswitch_5
    invoke-virtual {p0}, Lcom/c/b/g;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 219
    :pswitch_6
    invoke-virtual {p0}, Lcom/c/b/g;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 220
    :pswitch_7
    invoke-virtual {p0}, Lcom/c/b/g;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 221
    :pswitch_8
    invoke-virtual {p0}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    goto :goto_0

    .line 222
    :pswitch_9
    invoke-virtual {p0}, Lcom/c/b/g;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 223
    :pswitch_a
    invoke-virtual {p0}, Lcom/c/b/g;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 224
    :pswitch_b
    invoke-virtual {p0}, Lcom/c/b/g;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 225
    :pswitch_c
    invoke-virtual {p0}, Lcom/c/b/g;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 226
    :pswitch_d
    invoke-virtual {p0}, Lcom/c/b/g;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 228
    :pswitch_e
    invoke-virtual {p2, p0}, Lcom/c/b/cd$c;->a(Lcom/c/b/g;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 230
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "readPrimitiveField() cannot handle nested groups."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :pswitch_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "readPrimitiveField() cannot handle embedded messages."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :pswitch_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "readPrimitiveField() cannot handle enums."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method

.method public static b(I)I
    .locals 1

    .prologue
    .line 67
    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method
