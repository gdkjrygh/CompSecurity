.class public abstract Lcom/c/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/a/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/a/c$b;,
        Lcom/c/a/a/c$a;,
        Lcom/c/a/a/c$d;,
        Lcom/c/a/a/c$c;,
        Lcom/c/a/a/c$e;
    }
.end annotation


# static fields
.field public static final a:Lcom/c/a/a/c;

.field public static final b:Lcom/c/a/a/c;

.field public static final c:Lcom/c/a/a/c;

.field public static final d:Lcom/c/a/a/c;

.field public static final e:Lcom/c/a/a/c;

.field public static final f:Lcom/c/a/a/c;

.field public static final g:Lcom/c/a/a/c;

.field public static final h:Lcom/c/a/a/c;

.field public static final i:Lcom/c/a/a/c;

.field public static final j:Lcom/c/a/a/c;

.field public static final k:Lcom/c/a/a/c;

.field public static final l:Lcom/c/a/a/c;

.field public static final m:Lcom/c/a/a/c;

.field static final o:I

.field public static final p:Lcom/c/a/a/c;

.field private static final q:Ljava/lang/String;


# instance fields
.field final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/16 v6, 0x7f

    const/4 v1, 0x0

    const/16 v5, 0x1f

    .line 67
    new-instance v0, Lcom/c/a/a/d;

    invoke-direct {v0}, Lcom/c/a/a/d;-><init>()V

    sput-object v0, Lcom/c/a/a/c;->a:Lcom/c/a/a/c;

    .line 100
    const-string v0, "CharMatcher.ASCII"

    invoke-static {v1, v6, v0}, Lcom/c/a/a/c;->a(CCLjava/lang/String;)Lcom/c/a/a/c;

    move-result-object v0

    sput-object v0, Lcom/c/a/a/c;->b:Lcom/c/a/a/c;

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    .line 139
    :goto_0
    if-ge v0, v5, :cond_0

    .line 140
    const-string v3, "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10"

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, 0x9

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/c/a/a/c;->q:Ljava/lang/String;

    .line 150
    new-instance v0, Lcom/c/a/a/c$e;

    const-string v2, "CharMatcher.DIGIT"

    const-string v3, "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10"

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    sget-object v4, Lcom/c/a/a/c;->q:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lcom/c/a/a/c$e;-><init>(Ljava/lang/String;[C[C)V

    sput-object v0, Lcom/c/a/a/c;->c:Lcom/c/a/a/c;

    .line 158
    new-instance v0, Lcom/c/a/a/j;

    const-string v2, "CharMatcher.JAVA_DIGIT"

    invoke-direct {v0, v2}, Lcom/c/a/a/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->d:Lcom/c/a/a/c;

    .line 169
    new-instance v0, Lcom/c/a/a/k;

    const-string v2, "CharMatcher.JAVA_LETTER"

    invoke-direct {v0, v2}, Lcom/c/a/a/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->e:Lcom/c/a/a/c;

    .line 179
    new-instance v0, Lcom/c/a/a/l;

    const-string v2, "CharMatcher.JAVA_LETTER_OR_DIGIT"

    invoke-direct {v0, v2}, Lcom/c/a/a/l;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->f:Lcom/c/a/a/c;

    .line 190
    new-instance v0, Lcom/c/a/a/m;

    const-string v2, "CharMatcher.JAVA_UPPER_CASE"

    invoke-direct {v0, v2}, Lcom/c/a/a/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->g:Lcom/c/a/a/c;

    .line 201
    new-instance v0, Lcom/c/a/a/n;

    const-string v2, "CharMatcher.JAVA_LOWER_CASE"

    invoke-direct {v0, v2}, Lcom/c/a/a/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->h:Lcom/c/a/a/c;

    .line 212
    invoke-static {v1, v5}, Lcom/c/a/a/c;->a(CC)Lcom/c/a/a/c;

    move-result-object v0

    const/16 v1, 0x9f

    invoke-static {v6, v1}, Lcom/c/a/a/c;->a(CC)Lcom/c/a/a/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/a/a/c;->a(Lcom/c/a/a/c;)Lcom/c/a/a/c;

    move-result-object v0

    const-string v1, "CharMatcher.JAVA_ISO_CONTROL"

    invoke-virtual {v0, v1}, Lcom/c/a/a/c;->a(Ljava/lang/String;)Lcom/c/a/a/c;

    move-result-object v0

    sput-object v0, Lcom/c/a/a/c;->i:Lcom/c/a/a/c;

    .line 222
    new-instance v0, Lcom/c/a/a/c$e;

    const-string v1, "CharMatcher.INVISIBLE"

    const-string v2, "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u1680\u180e\u2000\u2028\u205f\u2066\u2067\u2068\u2069\u206a\u3000\ud800\ufeff\ufff9\ufffa"

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    const-string v3, " \u00a0\u00ad\u0604\u061c\u06dd\u070f\u1680\u180e\u200f\u202f\u2064\u2066\u2067\u2068\u2069\u206f\u3000\uf8ff\ufeff\ufff9\ufffb"

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/a/a/c$e;-><init>(Ljava/lang/String;[C[C)V

    sput-object v0, Lcom/c/a/a/c;->j:Lcom/c/a/a/c;

    .line 247
    new-instance v0, Lcom/c/a/a/c$e;

    const-string v1, "CharMatcher.SINGLE_WIDTH"

    const-string v2, "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61"

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    const-string v3, "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc"

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/a/a/c$e;-><init>(Ljava/lang/String;[C[C)V

    sput-object v0, Lcom/c/a/a/c;->k:Lcom/c/a/a/c;

    .line 252
    new-instance v0, Lcom/c/a/a/o;

    const-string v1, "CharMatcher.ANY"

    invoke-direct {v0, v1}, Lcom/c/a/a/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->l:Lcom/c/a/a/c;

    .line 328
    new-instance v0, Lcom/c/a/a/p;

    const-string v1, "CharMatcher.NONE"

    invoke-direct {v0, v1}, Lcom/c/a/a/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->m:Lcom/c/a/a/c;

    .line 1358
    invoke-static {v5}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    sput v0, Lcom/c/a/a/c;->o:I

    .line 1371
    new-instance v0, Lcom/c/a/a/i;

    const-string v1, "WHITESPACE"

    invoke-direct {v0, v1}, Lcom/c/a/a/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/c;->p:Lcom/c/a/a/c;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 608
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 609
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/a/c;->n:Ljava/lang/String;

    .line 610
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 600
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 601
    iput-object p1, p0, Lcom/c/a/a/c;->n:Ljava/lang/String;

    .line 602
    return-void
.end method

.method public static a(C)Lcom/c/a/a/c;
    .locals 3

    .prologue
    .line 415
    invoke-static {p0}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x12

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "CharMatcher.is(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 416
    new-instance v1, Lcom/c/a/a/q;

    invoke-direct {v1, v0, p0}, Lcom/c/a/a/q;-><init>(Ljava/lang/String;C)V

    return-object v1
.end method

.method private static a(CC)Lcom/c/a/a/c;
    .locals 5

    .prologue
    .line 550
    if-lt p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/c/a/a/u;->a(Z)V

    .line 551
    invoke-static {p0}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1b

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "CharMatcher.inRange(\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\', \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 554
    invoke-static {p0, p1, v0}, Lcom/c/a/a/c;->a(CCLjava/lang/String;)Lcom/c/a/a/c;

    move-result-object v0

    return-object v0

    .line 550
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(CCLjava/lang/String;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 559
    new-instance v0, Lcom/c/a/a/h;

    invoke-direct {v0, p2, p0, p1}, Lcom/c/a/a/h;-><init>(Ljava/lang/String;CC)V

    return-object v0
.end method

.method public static a(Ljava/lang/CharSequence;)Lcom/c/a/a/c;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 483
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 494
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 495
    invoke-static {v1}, Ljava/util/Arrays;->sort([C)V

    .line 496
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CharMatcher.anyOf(\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 497
    array-length v3, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-char v4, v1, v0

    .line 498
    invoke-static {v4}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 485
    :pswitch_0
    sget-object v0, Lcom/c/a/a/c;->m:Lcom/c/a/a/c;

    .line 501
    :goto_1
    return-object v0

    .line 487
    :pswitch_1
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/c/a/a/c;->a(C)Lcom/c/a/a/c;

    move-result-object v0

    goto :goto_1

    .line 489
    :pswitch_2
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v1}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x15

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "CharMatcher.anyOf(\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lcom/c/a/a/g;

    invoke-direct {v0, v3, v1, v2}, Lcom/c/a/a/g;-><init>(Ljava/lang/String;CC)V

    goto :goto_1

    .line 500
    :cond_0
    const-string v0, "\")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    new-instance v0, Lcom/c/a/a/f;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/c/a/a/f;-><init>(Ljava/lang/String;[C)V

    goto :goto_1

    .line 483
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b(C)Lcom/c/a/a/c;
    .locals 3

    .prologue
    .line 451
    invoke-static {p0}, Lcom/c/a/a/c;->d(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x15

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "CharMatcher.isNot(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 452
    new-instance v1, Lcom/c/a/a/e;

    invoke-direct {v1, v0, p0}, Lcom/c/a/a/e;-><init>(Ljava/lang/String;C)V

    return-object v1
.end method

.method private static d(C)Ljava/lang/String;
    .locals 5

    .prologue
    .line 229
    const-string v1, "0123456789ABCDEF"

    .line 230
    const/4 v0, 0x6

    new-array v2, v0, [C

    fill-array-data v2, :array_0

    .line 231
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v0, v3, :cond_0

    .line 232
    rsub-int/lit8 v3, v0, 0x5

    and-int/lit8 v4, p0, 0xf

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aput-char v4, v2, v3

    .line 233
    shr-int/lit8 v3, p0, 0x4

    int-to-char p0, v3

    .line 231
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 235
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->copyValueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 230
    nop

    :array_0
    .array-data 2
        0x5cs
        0x75s
        0x0s
        0x0s
        0x0s
        0x0s
    .end array-data
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;I)I
    .locals 3

    .prologue
    .line 1006
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1007
    invoke-static {p2, v1}, Lcom/c/a/a/u;->b(II)I

    move v0, p2

    .line 1008
    :goto_0
    if-ge v0, v1, :cond_1

    .line 1009
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1013
    :goto_1
    return v0

    .line 1008
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1013
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 623
    new-instance v0, Lcom/c/a/a/c$c;

    invoke-direct {v0, p0}, Lcom/c/a/a/c$c;-><init>(Lcom/c/a/a/c;)V

    return-object v0
.end method

.method public a(Lcom/c/a/a/c;)Lcom/c/a/a/c;
    .locals 2

    .prologue
    .line 720
    new-instance v1, Lcom/c/a/a/c$d;

    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/a/a/c;

    invoke-direct {v1, p0, v0}, Lcom/c/a/a/c$d;-><init>(Lcom/c/a/a/c;Lcom/c/a/a/c;)V

    return-object v1
.end method

.method a(Ljava/lang/String;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 775
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final a(Ljava/lang/Character;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1340
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/a/a/c;->c(C)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 55
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p0, p1}, Lcom/c/a/a/c;->a(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/CharSequence;)Z
    .locals 2

    .prologue
    .line 947
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 948
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 949
    const/4 v0, 0x0

    .line 952
    :goto_1
    return v0

    .line 947
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 952
    :cond_1
    const/4 v0, 0x1

    goto :goto_1
.end method

.method public abstract c(C)Z
.end method

.method public c(Ljava/lang/CharSequence;)Z
    .locals 2

    .prologue
    .line 967
    invoke-virtual {p0, p1}, Lcom/c/a/a/c;->d(Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Ljava/lang/CharSequence;)I
    .locals 3

    .prologue
    .line 981
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 982
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 983
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 987
    :goto_1
    return v0

    .line 982
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 987
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public e(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 5
    .annotation runtime Ljavax/annotation/CheckReturnValue;
    .end annotation

    .prologue
    .line 1058
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1059
    invoke-virtual {p0, v0}, Lcom/c/a/a/c;->d(Ljava/lang/CharSequence;)I

    move-result v1

    .line 1060
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 1082
    :goto_0
    return-object v0

    .line 1064
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 1065
    const/4 v0, 0x1

    .line 1069
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 1071
    array-length v2, v3

    if-eq v1, v2, :cond_2

    .line 1072
    aget-char v2, v3, v1

    invoke-virtual {p0, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1075
    sub-int v2, v1, v0

    aget-char v4, v3, v1

    aput-char v4, v3, v2

    goto :goto_1

    .line 1080
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1082
    :cond_2
    new-instance v2, Ljava/lang/String;

    const/4 v4, 0x0

    sub-int v0, v1, v0

    invoke-direct {v2, v3, v4, v0}, Ljava/lang/String;-><init>([CII)V

    move-object v0, v2

    goto :goto_0
.end method

.method public f(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 4
    .annotation runtime Ljavax/annotation/CheckReturnValue;
    .end annotation

    .prologue
    const/16 v3, 0x2e

    .line 1117
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1118
    invoke-virtual {p0, v0}, Lcom/c/a/a/c;->d(Ljava/lang/CharSequence;)I

    move-result v1

    .line 1119
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 1129
    :goto_0
    return-object v0

    .line 1122
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 1123
    aput-char v3, v2, v1

    .line 1124
    add-int/lit8 v0, v1, 0x1

    :goto_1
    array-length v1, v2

    if-ge v0, v1, :cond_2

    .line 1125
    aget-char v1, v2, v0

    invoke-virtual {p0, v1}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1126
    aput-char v3, v2, v0

    .line 1124
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1129
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1349
    iget-object v0, p0, Lcom/c/a/a/c;->n:Ljava/lang/String;

    return-object v0
.end method
