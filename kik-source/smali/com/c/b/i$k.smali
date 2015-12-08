.class public final Lcom/c/b/i$k;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$k$a;,
        Lcom/c/b/i$k$b;,
        Lcom/c/b/i$k$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final r:Lcom/c/b/i$k;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:I

.field private i:I

.field private j:I

.field private volatile k:Ljava/lang/Object;

.field private volatile l:Ljava/lang/Object;

.field private volatile m:Ljava/lang/Object;

.field private n:I

.field private o:Lcom/c/b/i$m;

.field private p:B

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11163
    new-instance v0, Lcom/c/b/i$k;

    invoke-direct {v0}, Lcom/c/b/i$k;-><init>()V

    sput-object v0, Lcom/c/b/i$k;->r:Lcom/c/b/i$k;

    .line 11170
    new-instance v0, Lcom/c/b/r;

    invoke-direct {v0}, Lcom/c/b/r;-><init>()V

    sput-object v0, Lcom/c/b/i$k;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 9182
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 10056
    iput-byte v0, p0, Lcom/c/b/i$k;->p:B

    .line 10104
    iput v0, p0, Lcom/c/b/i$k;->q:I

    .line 9183
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    .line 9184
    iput v1, p0, Lcom/c/b/i$k;->h:I

    .line 9185
    iput v2, p0, Lcom/c/b/i$k;->i:I

    .line 9186
    iput v2, p0, Lcom/c/b/i$k;->j:I

    .line 9187
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    .line 9188
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    .line 9189
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    .line 9190
    iput v1, p0, Lcom/c/b/i$k;->n:I

    .line 9191
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 9180
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 10056
    iput-byte v0, p0, Lcom/c/b/i$k;->p:B

    .line 10104
    iput v0, p0, Lcom/c/b/i$k;->q:I

    .line 9181
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 9174
    invoke-direct {p0, p1}, Lcom/c/b/i$k;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 9201
    invoke-direct {p0}, Lcom/c/b/i$k;-><init>()V

    .line 9202
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v4

    .line 9206
    const/4 v0, 0x0

    move v2, v0

    .line 9207
    :cond_0
    :goto_0
    if-nez v2, :cond_4

    .line 9208
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 9209
    sparse-switch v0, :sswitch_data_0

    .line 9214
    invoke-virtual {p0, p1, v4, p2, v0}, Lcom/c/b/i$k;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_0

    move v2, v3

    .line 9216
    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 9212
    goto :goto_0

    .line 9221
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 9222
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9223
    iput-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 9291
    :catch_0
    move-exception v0

    .line 9292
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9298
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    .line 9299
    invoke-virtual {p0}, Lcom/c/b/i$k;->L()V

    .line 9298
    throw v0

    .line 9227
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 9228
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9229
    iput-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 9293
    :catch_1
    move-exception v0

    .line 9294
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 9233
    :sswitch_3
    :try_start_4
    iget v0, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$k;->f:I

    .line 9234
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v0

    iput v0, p0, Lcom/c/b/i$k;->h:I

    goto :goto_0

    .line 9238
    :sswitch_4
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v0

    .line 9239
    invoke-static {v0}, Lcom/c/b/i$k$b;->a(I)Lcom/c/b/i$k$b;

    move-result-object v1

    .line 9240
    if-nez v1, :cond_1

    .line 9241
    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;

    goto :goto_0

    .line 9243
    :cond_1
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9244
    iput v0, p0, Lcom/c/b/i$k;->i:I

    goto :goto_0

    .line 9249
    :sswitch_5
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v0

    .line 9250
    invoke-static {v0}, Lcom/c/b/i$k$c;->a(I)Lcom/c/b/i$k$c;

    move-result-object v1

    .line 9251
    if-nez v1, :cond_2

    .line 9252
    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;

    goto/16 :goto_0

    .line 9254
    :cond_2
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9255
    iput v0, p0, Lcom/c/b/i$k;->j:I

    goto/16 :goto_0

    .line 9260
    :sswitch_6
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 9261
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9262
    iput-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    goto/16 :goto_0

    .line 9266
    :sswitch_7
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 9267
    iget v1, p0, Lcom/c/b/i$k;->f:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lcom/c/b/i$k;->f:I

    .line 9268
    iput-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    goto/16 :goto_0

    .line 9272
    :sswitch_8
    const/4 v0, 0x0

    .line 9273
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v1, v1, 0x100

    const/16 v5, 0x100

    if-ne v1, v5, :cond_5

    .line 9274
    iget-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    invoke-virtual {v0}, Lcom/c/b/i$m;->x()Lcom/c/b/i$m$a;

    move-result-object v0

    move-object v1, v0

    .line 9276
    :goto_1
    sget-object v0, Lcom/c/b/i$m;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m;

    iput-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    .line 9277
    if-eqz v1, :cond_3

    .line 9278
    iget-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    invoke-virtual {v1, v0}, Lcom/c/b/i$m$a;->a(Lcom/c/b/i$m;)Lcom/c/b/i$m$a;

    .line 9279
    invoke-virtual {v1}, Lcom/c/b/i$m$a;->g()Lcom/c/b/i$m;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    .line 9281
    :cond_3
    iget v0, p0, Lcom/c/b/i$k;->f:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/c/b/i$k;->f:I

    goto/16 :goto_0

    .line 9285
    :sswitch_9
    iget v0, p0, Lcom/c/b/i$k;->f:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/c/b/i$k;->f:I

    .line 9286
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v0

    iput v0, p0, Lcom/c/b/i$k;->n:I
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 9298
    :cond_4
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    .line 9299
    invoke-virtual {p0}, Lcom/c/b/i$k;->L()V

    .line 9300
    return-void

    :cond_5
    move-object v1, v0

    goto :goto_1

    .line 9209
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
        0x48 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 9174
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$k;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method public static D()Lcom/c/b/i$k;
    .locals 1

    .prologue
    .line 11167
    sget-object v0, Lcom/c/b/i$k;->r:Lcom/c/b/i$k;

    return-object v0
.end method

.method private E()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 9752
    iget-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    .line 9753
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9754
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 9757
    iput-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    .line 9760
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private F()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 9875
    iget-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    .line 9876
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9877
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 9880
    iput-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    .line 9883
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private G()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 9932
    iget-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    .line 9933
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9934
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 9937
    iput-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    .line 9940
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private H()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 9998
    iget-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    .line 9999
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 10000
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 10003
    iput-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    .line 10006
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private I()Lcom/c/b/i$k$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 10213
    sget-object v0, Lcom/c/b/i$k;->r:Lcom/c/b/i$k;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$k$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$k$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$k$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$k$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$k$a;->a(Lcom/c/b/i$k;)Lcom/c/b/i$k$a;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/c/b/i$k;I)I
    .locals 0

    .prologue
    .line 9174
    iput p1, p0, Lcom/c/b/i$k;->h:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$k;Lcom/c/b/i$m;)Lcom/c/b/i$m;
    .locals 0

    .prologue
    .line 9174
    iput-object p1, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$k;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9174
    iget-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 9174
    iput-object p1, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$k;I)I
    .locals 0

    .prologue
    .line 9174
    iput p1, p0, Lcom/c/b/i$k;->i:I

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$k;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9174
    iget-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 9174
    iput-object p1, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lcom/c/b/i$k;I)I
    .locals 0

    .prologue
    .line 9174
    iput p1, p0, Lcom/c/b/i$k;->j:I

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$k;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9174
    iget-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 9174
    iput-object p1, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic d(Lcom/c/b/i$k;I)I
    .locals 0

    .prologue
    .line 9174
    iput p1, p0, Lcom/c/b/i$k;->n:I

    return p1
.end method

.method static synthetic d(Lcom/c/b/i$k;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9174
    iget-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/c/b/i$k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 9174
    iput-object p1, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic e(Lcom/c/b/i$k;I)I
    .locals 0

    .prologue
    .line 9174
    iput p1, p0, Lcom/c/b/i$k;->f:I

    return p1
.end method


# virtual methods
.method public final A()I
    .locals 1

    .prologue
    .line 10032
    iget v0, p0, Lcom/c/b/i$k;->n:I

    return v0
.end method

.method public final B()Z
    .locals 2

    .prologue
    .line 10041
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final C()Lcom/c/b/i$m;
    .locals 1

    .prologue
    .line 10047
    iget-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$m;->y()Lcom/c/b/i$m;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$k;->o:Lcom/c/b/i$m;

    goto :goto_0
.end method

.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 9174
    new-instance v0, Lcom/c/b/i$k$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$k$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 10074
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 10075
    invoke-direct {p0}, Lcom/c/b/i$k;->E()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 10077
    :cond_0
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 10078
    invoke-direct {p0}, Lcom/c/b/i$k;->G()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 10080
    :cond_1
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_2

    .line 10081
    const/4 v0, 0x3

    iget v1, p0, Lcom/c/b/i$k;->h:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(II)V

    .line 10083
    :cond_2
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v3, :cond_3

    .line 10084
    iget v0, p0, Lcom/c/b/i$k;->i:I

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->c(II)V

    .line 10086
    :cond_3
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v4, :cond_4

    .line 10087
    const/4 v0, 0x5

    iget v1, p0, Lcom/c/b/i$k;->j:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->c(II)V

    .line 10089
    :cond_4
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 10090
    const/4 v0, 0x6

    invoke-direct {p0}, Lcom/c/b/i$k;->F()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 10092
    :cond_5
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 10093
    const/4 v0, 0x7

    invoke-direct {p0}, Lcom/c/b/i$k;->H()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 10095
    :cond_6
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_7

    .line 10096
    invoke-virtual {p0}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 10098
    :cond_7
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 10099
    const/16 v0, 0x9

    iget v1, p0, Lcom/c/b/i$k;->n:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(II)V

    .line 10101
    :cond_8
    iget-object v0, p0, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 10102
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 10058
    iget-byte v2, p0, Lcom/c/b/i$k;->p:B

    .line 10059
    if-ne v2, v0, :cond_0

    .line 10069
    :goto_0
    return v0

    .line 10060
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 10062
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/i$k;->B()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10063
    invoke-virtual {p0}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$m;->a()Z

    move-result v2

    if-nez v2, :cond_2

    .line 10064
    iput-byte v1, p0, Lcom/c/b/i$k;->p:B

    move v0, v1

    .line 10065
    goto :goto_0

    .line 10068
    :cond_2
    iput-byte v0, p0, Lcom/c/b/i$k;->p:B

    goto :goto_0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 10106
    iget v0, p0, Lcom/c/b/i$k;->q:I

    .line 10107
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 10148
    :goto_0
    return v0

    .line 10109
    :cond_0
    const/4 v0, 0x0

    .line 10110
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 10111
    invoke-direct {p0}, Lcom/c/b/i$k;->E()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 10114
    :cond_1
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_2

    .line 10115
    invoke-direct {p0}, Lcom/c/b/i$k;->G()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10118
    :cond_2
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_3

    .line 10119
    const/4 v1, 0x3

    iget v2, p0, Lcom/c/b/i$k;->h:I

    invoke-static {v1, v2}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 10122
    :cond_3
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x4

    if-ne v1, v4, :cond_4

    .line 10123
    iget v1, p0, Lcom/c/b/i$k;->i:I

    invoke-static {v4, v1}, Lcom/c/b/h;->f(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 10126
    :cond_4
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x8

    if-ne v1, v5, :cond_5

    .line 10127
    const/4 v1, 0x5

    iget v2, p0, Lcom/c/b/i$k;->j:I

    invoke-static {v1, v2}, Lcom/c/b/h;->f(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 10130
    :cond_5
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_6

    .line 10131
    const/4 v1, 0x6

    invoke-direct {p0}, Lcom/c/b/i$k;->F()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10134
    :cond_6
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x40

    const/16 v2, 0x40

    if-ne v1, v2, :cond_7

    .line 10135
    const/4 v1, 0x7

    invoke-direct {p0}, Lcom/c/b/i$k;->H()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10138
    :cond_7
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v1, v1, 0x100

    const/16 v2, 0x100

    if-ne v1, v2, :cond_8

    .line 10139
    invoke-virtual {p0}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10142
    :cond_8
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v1, v1, 0x80

    const/16 v2, 0x80

    if-ne v1, v2, :cond_9

    .line 10143
    const/16 v1, 0x9

    iget v2, p0, Lcom/c/b/i$k;->n:I

    invoke-static {v1, v2}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 10146
    :cond_9
    iget-object v1, p0, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 10147
    iput v0, p0, Lcom/c/b/i$k;->q:I

    goto/16 :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 9309
    invoke-static {}, Lcom/c/b/i;->k()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$k;

    const-class v2, Lcom/c/b/i$k$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 9196
    iget-object v0, p0, Lcom/c/b/i$k;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 9728
    iget v1, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9734
    iget-object v0, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    .line 9735
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9736
    check-cast v0, Ljava/lang/String;

    .line 9744
    :goto_0
    return-object v0

    .line 9738
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 9740
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 9741
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9742
    iput-object v1, p0, Lcom/c/b/i$k;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 9744
    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 9770
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 9776
    iget v0, p0, Lcom/c/b/i$k;->h:I

    return v0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 9785
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Lcom/c/b/i$k$b;
    .locals 1

    .prologue
    .line 9791
    iget v0, p0, Lcom/c/b/i$k;->i:I

    invoke-static {v0}, Lcom/c/b/i$k$b;->a(I)Lcom/c/b/i$k$b;

    move-result-object v0

    .line 9792
    if-nez v0, :cond_0

    sget-object v0, Lcom/c/b/i$k$b;->a:Lcom/c/b/i$k$b;

    :cond_0
    return-object v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 9806
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Lcom/c/b/i$k$c;
    .locals 1

    .prologue
    .line 9817
    iget v0, p0, Lcom/c/b/i$k;->j:I

    invoke-static {v0}, Lcom/c/b/i$k$c;->a(I)Lcom/c/b/i$k$c;

    move-result-object v0

    .line 9818
    if-nez v0, :cond_0

    sget-object v0, Lcom/c/b/i$k$c;->a:Lcom/c/b/i$k$c;

    :cond_0
    return-object v0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 9835
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9849
    iget-object v0, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    .line 9850
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9851
    check-cast v0, Ljava/lang/String;

    .line 9859
    :goto_0
    return-object v0

    .line 9853
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 9855
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 9856
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9857
    iput-object v1, p0, Lcom/c/b/i$k;->k:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 9859
    goto :goto_0
.end method

.method public final r()Z
    .locals 2

    .prologue
    .line 9898
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9909
    iget-object v0, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    .line 9910
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9911
    check-cast v0, Ljava/lang/String;

    .line 9919
    :goto_0
    return-object v0

    .line 9913
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 9915
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 9916
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9917
    iput-object v1, p0, Lcom/c/b/i$k;->l:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 9919
    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 11195
    sget-object v0, Lcom/c/b/i$k;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 9174
    sget-object v0, Lcom/c/b/i$k;->r:Lcom/c/b/i$k;

    invoke-direct {v0}, Lcom/c/b/i$k;->I()Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 9174
    invoke-direct {p0}, Lcom/c/b/i$k;->I()Lcom/c/b/i$k$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 9174
    sget-object v0, Lcom/c/b/i$k;->r:Lcom/c/b/i$k;

    return-object v0
.end method

.method public final x()Z
    .locals 2

    .prologue
    .line 9958
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9972
    iget-object v0, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    .line 9973
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9974
    check-cast v0, Ljava/lang/String;

    .line 9982
    :goto_0
    return-object v0

    .line 9976
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 9978
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 9979
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9980
    iput-object v1, p0, Lcom/c/b/i$k;->m:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 9982
    goto :goto_0
.end method

.method public final z()Z
    .locals 2

    .prologue
    .line 10021
    iget v0, p0, Lcom/c/b/i$k;->f:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
