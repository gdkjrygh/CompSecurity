.class public Lkik/a/f/d/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/d/a/a;


# static fields
.field private static final ILLEGAL_TYPE:Ljava/lang/String; = "Wrong event type"

.field private static final LEGACY:I = 0x3e7

.field private static final UNEXPECTED_EOF:Ljava/lang/String; = "Unexpected EOF"

.field private static final XML_DECL:I = 0x3e6


# instance fields
.field private attributeCount:I

.field private attributes:[Ljava/lang/String;

.field protected column:I

.field private degenerated:Z

.field private depth:I

.field private elementStack:[Ljava/lang/String;

.field private encoding:Ljava/lang/String;

.field private entityMap:Ljava/util/Hashtable;

.field private error:Ljava/lang/String;

.field private isWhitespace:Z

.field protected line:I

.field private location:Ljava/lang/Object;

.field private name:Ljava/lang/String;

.field private namespace:Ljava/lang/String;

.field private nspCounts:[I

.field private nspStack:[Ljava/lang/String;

.field protected peek:[I

.field protected peekCount:I

.field private prefix:Ljava/lang/String;

.field private processNsp:Z

.field private reader:Ljava/io/Reader;

.field private relaxed:Z

.field protected srcBuf:[C

.field protected srcCount:I

.field protected srcPos:I

.field private stackMismatch:I

.field private standalone:Ljava/lang/Boolean;

.field private token:Z

.field private txtBuf:[C

.field private txtPos:I

.field private type:I

.field private unresolved:Z

.field private version:Ljava/lang/String;

.field protected wasCR:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/16 v0, 0x80

    const/16 v2, 0x10

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-array v1, v2, [Ljava/lang/String;

    iput-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    .line 60
    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/String;

    iput-object v1, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    .line 61
    const/4 v1, 0x4

    new-array v1, v1, [I

    iput-object v1, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    .line 70
    new-array v1, v0, [C

    iput-object v1, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    .line 84
    new-array v1, v2, [Ljava/lang/String;

    iput-object v1, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    .line 85
    const/4 v1, 0x0

    iput v1, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    .line 101
    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, p0, Lkik/a/f/d/a/a;->peek:[I

    .line 110
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    const-wide/32 v4, 0x100000

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    const/16 v0, 0x2000

    :cond_0
    new-array v0, v0, [C

    iput-object v0, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    .line 111
    return-void
.end method

.method private final adjustNsp()Z
    .locals 11

    .prologue
    const/16 v9, 0x3a

    const/4 v8, -0x1

    const/4 v1, 0x0

    .line 129
    move v0, v1

    move v2, v1

    .line 131
    :goto_0
    iget v3, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v3, v3, 0x2

    if-ge v0, v3, :cond_4

    .line 134
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x2

    aget-object v4, v3, v4

    .line 135
    invoke-virtual {v4, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    .line 138
    if-eq v5, v8, :cond_1

    .line 139
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 140
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 150
    :goto_1
    const-string v5, "xmlns"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 151
    const/4 v2, 0x1

    .line 131
    :cond_0
    :goto_2
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    .line 142
    :cond_1
    const-string v3, "xmlns"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 144
    const/4 v3, 0x0

    move-object v10, v4

    move-object v4, v3

    move-object v3, v10

    goto :goto_1

    .line 154
    :cond_2
    iget-object v3, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    iget v5, p0, Lkik/a/f/d/a/a;->depth:I

    aget v6, v3, v5

    add-int/lit8 v7, v6, 0x1

    aput v7, v3, v5

    shl-int/lit8 v3, v6, 0x1

    .line 156
    iget-object v5, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    add-int/lit8 v6, v3, 0x2

    invoke-direct {p0, v5, v6}, Lkik/a/f/d/a/a;->ensureCapacity([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    .line 157
    iget-object v5, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    aput-object v4, v5, v3

    .line 158
    iget-object v5, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    iget-object v6, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v7, v0, 0x3

    aget-object v6, v6, v7

    aput-object v6, v5, v3

    .line 160
    if-eqz v4, :cond_3

    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x3

    aget-object v3, v3, v4

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 161
    const-string v3, "illegal empty namespace"

    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 166
    :cond_3
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x4

    iget-object v5, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    iget v6, p0, Lkik/a/f/d/a/a;->attributeCount:I

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v6, v6, 0x2

    sub-int/2addr v6, v0

    invoke-static {v3, v4, v5, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    add-int/lit8 v0, v0, -0x4

    goto :goto_2

    .line 172
    :cond_4
    if-eqz v2, :cond_8

    .line 173
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x4

    :goto_3
    if-ltz v0, :cond_8

    .line 175
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x2

    aget-object v3, v3, v4

    .line 176
    invoke-virtual {v3, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    .line 178
    if-nez v4, :cond_5

    iget-boolean v5, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-nez v5, :cond_5

    .line 179
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal attribute name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_5
    if-eq v4, v8, :cond_7

    .line 182
    invoke-virtual {v3, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 184
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 186
    invoke-virtual {p0, v5}, Lkik/a/f/d/a/a;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 188
    if-nez v4, :cond_6

    iget-boolean v6, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-nez v6, :cond_6

    .line 189
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Undefined Prefix: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_6
    iget-object v6, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    aput-object v4, v6, v0

    .line 193
    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v6, v0, 0x1

    aput-object v5, v4, v6

    .line 194
    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x2

    aput-object v3, v4, v5

    .line 173
    :cond_7
    add-int/lit8 v0, v0, -0x4

    goto :goto_3

    .line 212
    :cond_8
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 214
    if-nez v0, :cond_9

    .line 215
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "illegal tag name: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 218
    :cond_9
    if-eq v0, v8, :cond_a

    .line 219
    iget-object v3, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    .line 220
    iget-object v1, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 223
    :cond_a
    iget-object v0, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/d/a/a;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 225
    iget-object v0, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    if-nez v0, :cond_c

    .line 226
    iget-object v0, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "undefined prefix: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 229
    :cond_b
    const-string v0, ""

    iput-object v0, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 232
    :cond_c
    return v2
.end method

.method private final ensureCapacity([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 237
    array-length v0, p1

    if-lt v0, p2, :cond_0

    .line 242
    :goto_0
    return-object p1

    .line 240
    :cond_0
    add-int/lit8 v0, p2, 0x10

    new-array v0, v0, [Ljava/lang/String;

    .line 241
    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 242
    goto :goto_0
.end method

.method private final error(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 247
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ERR: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    .line 255
    :cond_0
    :goto_0
    return-void

    .line 253
    :cond_1
    invoke-direct {p0, p1}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private final exception(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/16 v3, 0x64

    .line 259
    new-instance v0, Lorg/d/a/b;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v3, :cond_0

    :goto_0
    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;Lorg/d/a/a;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private final get(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 609
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    iget v2, p0, Lkik/a/f/d/a/a;->txtPos:I

    sub-int/2addr v2, p1

    invoke-direct {v0, v1, p1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private final isProp(Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 1

    .prologue
    .line 115
    const-string v0, "http://xmlpull.org/v1/doc/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    const/4 v0, 0x0

    .line 122
    :goto_0
    return v0

    .line 118
    :cond_0
    if-eqz p2, :cond_1

    .line 119
    const/16 v0, 0x2a

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 122
    :cond_1
    const/16 v0, 0x28

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private final nextImpl()V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v6, -0x1

    const/4 v5, 0x3

    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 270
    iget-object v2, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    if-nez v2, :cond_0

    .line 271
    const-string v2, "No Input specified"

    invoke-direct {p0, v2}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 274
    :cond_0
    iget v2, p0, Lkik/a/f/d/a/a;->type:I

    if-ne v2, v5, :cond_1

    .line 275
    iget v2, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lkik/a/f/d/a/a;->depth:I

    .line 279
    :cond_1
    iput v6, p0, Lkik/a/f/d/a/a;->attributeCount:I

    .line 284
    iget-boolean v2, p0, Lkik/a/f/d/a/a;->degenerated:Z

    if-eqz v2, :cond_3

    .line 285
    iput-boolean v0, p0, Lkik/a/f/d/a/a;->degenerated:Z

    .line 286
    iput v5, p0, Lkik/a/f/d/a/a;->type:I

    .line 354
    :cond_2
    :goto_0
    :pswitch_0
    return-void

    .line 290
    :cond_3
    iget-object v2, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 291
    :goto_1
    iget-object v1, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 292
    iget-object v1, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->push(I)V

    .line 291
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 295
    :cond_4
    iput-object v4, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    .line 296
    const/16 v0, 0x9

    iput v0, p0, Lkik/a/f/d/a/a;->type:I

    goto :goto_0

    .line 300
    :cond_5
    iget-boolean v2, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-eqz v2, :cond_8

    iget v2, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    if-gtz v2, :cond_6

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v2

    if-ne v2, v6, :cond_8

    iget v2, p0, Lkik/a/f/d/a/a;->depth:I

    if-lez v2, :cond_8

    .line 301
    :cond_6
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v0, v0, -0x1

    shl-int/lit8 v0, v0, 0x2

    .line 302
    iput v5, p0, Lkik/a/f/d/a/a;->type:I

    .line 303
    iget-object v2, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    aget-object v2, v2, v0

    iput-object v2, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 304
    iget-object v2, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v3, v0, 0x1

    aget-object v2, v2, v3

    iput-object v2, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    .line 305
    iget-object v2, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    aget-object v0, v2, v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 306
    iget v0, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    if-eq v0, v1, :cond_7

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "missing end tag /"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " inserted"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->error:Ljava/lang/String;

    .line 309
    :cond_7
    iget v0, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    if-lez v0, :cond_2

    .line 310
    iget v0, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    goto :goto_0

    .line 315
    :cond_8
    iput-object v4, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    .line 316
    iput-object v4, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 317
    iput-object v4, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 320
    invoke-direct {p0}, Lkik/a/f/d/a/a;->peekType()I

    move-result v2

    iput v2, p0, Lkik/a/f/d/a/a;->type:I

    .line 322
    iget v2, p0, Lkik/a/f/d/a/a;->type:I

    packed-switch v2, :pswitch_data_0

    .line 352
    :pswitch_1
    iget-boolean v2, p0, Lkik/a/f/d/a/a;->token:Z

    invoke-direct {p0, v2}, Lkik/a/f/d/a/a;->parseLegacy(Z)I

    move-result v2

    iput v2, p0, Lkik/a/f/d/a/a;->type:I

    .line 353
    iget v2, p0, Lkik/a/f/d/a/a;->type:I

    const/16 v3, 0x3e6

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    .line 325
    :pswitch_2
    invoke-direct {p0}, Lkik/a/f/d/a/a;->pushEntity()V

    goto/16 :goto_0

    .line 329
    :pswitch_3
    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->parseStartTag(Z)V

    goto/16 :goto_0

    .line 333
    :pswitch_4
    invoke-direct {p0}, Lkik/a/f/d/a/a;->parseEndTag()V

    goto/16 :goto_0

    .line 340
    :pswitch_5
    const/16 v2, 0x3c

    iget-boolean v3, p0, Lkik/a/f/d/a/a;->token:Z

    if-nez v3, :cond_9

    move v0, v1

    :cond_9
    invoke-direct {p0, v2, v0}, Lkik/a/f/d/a/a;->pushText(IZ)V

    .line 341
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    if-nez v0, :cond_2

    .line 342
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    if-eqz v0, :cond_2

    .line 343
    const/4 v0, 0x7

    iput v0, p0, Lkik/a/f/d/a/a;->type:I

    goto/16 :goto_0

    .line 322
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private final parseDoctype(Z)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 505
    move v0, v1

    move v2, v3

    .line 511
    :cond_0
    :goto_0
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v4

    .line 512
    sparse-switch v4, :sswitch_data_0

    .line 536
    :cond_1
    :goto_1
    if-eqz p1, :cond_0

    .line 537
    invoke-direct {p0, v4}, Lkik/a/f/d/a/a;->push(I)V

    goto :goto_0

    .line 515
    :sswitch_0
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 531
    :goto_2
    return-void

    .line 519
    :sswitch_1
    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_1

    .line 523
    :sswitch_2
    if-nez v0, :cond_1

    .line 524
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 529
    :sswitch_3
    if-nez v0, :cond_1

    .line 530
    add-int/lit8 v2, v2, -0x1

    if-nez v2, :cond_1

    goto :goto_2

    .line 512
    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x27 -> :sswitch_1
        0x3c -> :sswitch_2
        0x3e -> :sswitch_3
    .end sparse-switch
.end method

.method private final parseEndTag()V
    .locals 6

    .prologue
    const/16 v5, 0x9

    .line 547
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 548
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 549
    invoke-direct {p0}, Lkik/a/f/d/a/a;->readName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 550
    invoke-direct {p0}, Lkik/a/f/d/a/a;->skip()V

    .line 551
    const/16 v0, 0x3e

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->read(C)V

    .line 553
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v0, v0, -0x1

    shl-int/lit8 v1, v0, 0x2

    .line 555
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    if-nez v0, :cond_0

    .line 556
    const-string v0, "element stack empty"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 557
    iput v5, p0, Lkik/a/f/d/a/a;->type:I

    .line 583
    :goto_0
    return-void

    .line 561
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    iget-object v2, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v3, v1, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 562
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "expected: /"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v3, v1, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " read: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    move v0, v1

    .line 567
    :goto_1
    if-ltz v0, :cond_1

    iget-object v2, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 568
    iget v2, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    .line 569
    add-int/lit8 v0, v0, -0x4

    goto :goto_1

    .line 572
    :cond_1
    if-gez v0, :cond_2

    .line 573
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/f/d/a/a;->stackMismatch:I

    .line 575
    iput v5, p0, Lkik/a/f/d/a/a;->type:I

    goto :goto_0

    .line 580
    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    aget-object v0, v0, v1

    iput-object v0, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 581
    iget-object v0, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v2, v1, 0x1

    aget-object v0, v0, v2

    iput-object v0, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    .line 582
    iget-object v0, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v1, v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    goto :goto_0
.end method

.method private final parseLegacy(Z)I
    .locals 11

    .prologue
    const/16 v2, 0x9

    const/16 v4, 0x3f

    const/16 v5, 0x2d

    const/4 v1, 0x1

    const/4 v8, 0x0

    .line 363
    const-string v3, ""

    .line 368
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 369
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v0

    .line 371
    if-ne v0, v4, :cond_d

    .line 372
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x78

    if-eq v0, v6, :cond_0

    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x58

    if-ne v0, v6, :cond_c

    :cond_0
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x6d

    if-eq v0, v6, :cond_1

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x4d

    if-ne v0, v6, :cond_c

    .line 374
    :cond_1
    if-eqz p1, :cond_2

    .line 375
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->push(I)V

    .line 376
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->push(I)V

    .line 378
    :cond_2
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 379
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 381
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x6c

    if-eq v0, v6, :cond_3

    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x4c

    if-ne v0, v6, :cond_c

    :cond_3
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v6, 0x20

    if-gt v0, v6, :cond_c

    .line 383
    iget v0, p0, Lkik/a/f/d/a/a;->line:I

    if-ne v0, v1, :cond_4

    iget v0, p0, Lkik/a/f/d/a/a;->column:I

    const/4 v2, 0x4

    if-le v0, v2, :cond_5

    .line 384
    :cond_4
    const-string v0, "PI must not start with xml"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 387
    :cond_5
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->parseStartTag(Z)V

    .line 389
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-lez v0, :cond_6

    const-string v0, "version"

    iget-object v2, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 390
    :cond_6
    const-string v0, "version expected"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 393
    :cond_7
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v0, v0, v2

    iput-object v0, p0, Lkik/a/f/d/a/a;->version:Ljava/lang/String;

    .line 397
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-ge v1, v0, :cond_1a

    const-string v0, "encoding"

    iget-object v2, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 398
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iput-object v0, p0, Lkik/a/f/d/a/a;->encoding:Ljava/lang/String;

    .line 399
    const/4 v0, 0x2

    .line 402
    :goto_0
    iget v2, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-ge v0, v2, :cond_8

    const-string v2, "standalone"

    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 403
    iget-object v2, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x3

    aget-object v2, v2, v3

    .line 404
    const-string v3, "yes"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 405
    new-instance v2, Ljava/lang/Boolean;

    invoke-direct {v2, v1}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v2, p0, Lkik/a/f/d/a/a;->standalone:Ljava/lang/Boolean;

    .line 413
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 416
    :cond_8
    iget v2, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-eq v0, v2, :cond_9

    .line 417
    const-string v0, "illegal xmldecl"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 420
    :cond_9
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    .line 421
    iput v8, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 423
    const/16 v2, 0x3e6

    .line 497
    :goto_2
    return v2

    .line 407
    :cond_a
    const-string v3, "no"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 408
    new-instance v2, Ljava/lang/Boolean;

    invoke-direct {v2, v8}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v2, p0, Lkik/a/f/d/a/a;->standalone:Ljava/lang/Boolean;

    goto :goto_1

    .line 411
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "illegal standalone value: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 434
    :cond_c
    const/16 v0, 0x8

    move-object v6, v3

    move v3, v4

    :goto_3
    move v7, v8

    .line 459
    :goto_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_11

    .line 460
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-direct {p0, v9}, Lkik/a/f/d/a/a;->read(C)V

    .line 459
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 436
    :cond_d
    const/16 v3, 0x21

    if-ne v0, v3, :cond_10

    .line 437
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    if-ne v0, v5, :cond_e

    .line 439
    const-string v0, "--"

    move v3, v5

    move-object v6, v0

    move v0, v2

    .line 440
    goto :goto_3

    .line 442
    :cond_e
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    const/16 v3, 0x5b

    if-ne v0, v3, :cond_f

    .line 443
    const/4 v0, 0x5

    .line 444
    const-string v6, "[CDATA["

    .line 445
    const/16 v3, 0x5d

    move p1, v1

    .line 446
    goto :goto_3

    .line 449
    :cond_f
    const/16 v0, 0xa

    .line 450
    const-string v6, "DOCTYPE"

    .line 451
    const/4 v3, -0x1

    goto :goto_3

    .line 455
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "illegal: <"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto :goto_2

    .line 463
    :cond_11
    const/16 v6, 0xa

    if-ne v0, v6, :cond_19

    .line 464
    invoke-direct {p0, p1}, Lkik/a/f/d/a/a;->parseDoctype(Z)V

    :cond_12
    :goto_5
    move v2, v0

    .line 497
    goto :goto_2

    .line 474
    :cond_13
    if-eqz p1, :cond_14

    .line 475
    invoke-direct {p0, v7}, Lkik/a/f/d/a/a;->push(I)V

    .line 478
    :cond_14
    if-eq v3, v4, :cond_15

    if-ne v7, v3, :cond_16

    :cond_15
    invoke-direct {p0, v8}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v9

    if-ne v9, v3, :cond_16

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v9

    const/16 v10, 0x3e

    if-eq v9, v10, :cond_17

    :cond_16
    move v6, v7

    .line 468
    :goto_6
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v7

    .line 469
    const/4 v9, -0x1

    if-ne v7, v9, :cond_13

    .line 470
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 485
    :cond_17
    if-ne v3, v5, :cond_18

    if-ne v6, v5, :cond_18

    .line 486
    const-string v1, "illegal comment delimiter: --->"

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 489
    :cond_18
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 490
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 492
    if-eqz p1, :cond_12

    if-eq v3, v4, :cond_12

    .line 493
    iget v1, p0, Lkik/a/f/d/a/a;->txtPos:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lkik/a/f/d/a/a;->txtPos:I

    goto :goto_5

    :cond_19
    move v6, v8

    goto :goto_6

    :cond_1a
    move v0, v1

    goto/16 :goto_0
.end method

.method private final parseStartTag(Z)V
    .locals 10

    .prologue
    const/16 v9, 0x3d

    const/16 v1, 0x20

    const/4 v8, 0x1

    const/16 v7, 0x3e

    const/4 v6, 0x0

    .line 639
    if-nez p1, :cond_0

    .line 640
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 642
    :cond_0
    invoke-direct {p0}, Lkik/a/f/d/a/a;->readName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 643
    iput v6, p0, Lkik/a/f/d/a/a;->attributeCount:I

    .line 646
    :cond_1
    :goto_0
    invoke-direct {p0}, Lkik/a/f/d/a/a;->skip()V

    .line 648
    invoke-direct {p0, v6}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    .line 650
    if-eqz p1, :cond_2

    .line 651
    const/16 v2, 0x3f

    if-ne v0, v2, :cond_5

    .line 652
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 653
    invoke-direct {p0, v7}, Lkik/a/f/d/a/a;->read(C)V

    .line 758
    :goto_1
    return-void

    .line 658
    :cond_2
    const/16 v2, 0x2f

    if-ne v0, v2, :cond_4

    .line 659
    iput-boolean v8, p0, Lkik/a/f/d/a/a;->degenerated:Z

    .line 660
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 661
    invoke-direct {p0}, Lkik/a/f/d/a/a;->skip()V

    .line 662
    invoke-direct {p0, v7}, Lkik/a/f/d/a/a;->read(C)V

    .line 725
    :goto_2
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->depth:I

    shl-int/lit8 v0, v0, 0x2

    .line 727
    iget-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x4

    invoke-direct {p0, v1, v2}, Lkik/a/f/d/a/a;->ensureCapacity([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    .line 728
    iget-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x3

    iget-object v3, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    aput-object v3, v1, v2

    .line 730
    iget v1, p0, Lkik/a/f/d/a/a;->depth:I

    iget-object v2, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    array-length v2, v2

    if-lt v1, v2, :cond_3

    .line 731
    iget v1, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v1, v1, 0x4

    new-array v1, v1, [I

    .line 732
    iget-object v2, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    iget-object v3, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    array-length v3, v3

    invoke-static {v2, v6, v1, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 733
    iput-object v1, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    .line 736
    :cond_3
    iget-object v1, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    iget v2, p0, Lkik/a/f/d/a/a;->depth:I

    iget-object v3, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    iget v4, p0, Lkik/a/f/d/a/a;->depth:I

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    aput v3, v1, v2

    .line 748
    iget-boolean v1, p0, Lkik/a/f/d/a/a;->processNsp:Z

    if-eqz v1, :cond_a

    .line 749
    invoke-direct {p0}, Lkik/a/f/d/a/a;->adjustNsp()Z

    .line 755
    :goto_3
    iget-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    iget-object v2, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    aput-object v2, v1, v0

    .line 756
    iget-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    iget-object v3, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    aput-object v3, v1, v2

    .line 757
    iget-object v1, p0, Lkik/a/f/d/a/a;->elementStack:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    iget-object v2, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    aput-object v2, v1, v0

    goto :goto_1

    .line 666
    :cond_4
    if-ne v0, v7, :cond_5

    if-nez p1, :cond_5

    .line 667
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    goto :goto_2

    .line 672
    :cond_5
    const/4 v2, -0x1

    if-ne v0, v2, :cond_6

    .line 673
    const-string v0, "Unexpected EOF"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 678
    :cond_6
    invoke-direct {p0}, Lkik/a/f/d/a/a;->readName()Ljava/lang/String;

    move-result-object v0

    .line 680
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_7

    .line 681
    const-string v0, "attr name expected"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto :goto_2

    .line 686
    :cond_7
    iget v2, p0, Lkik/a/f/d/a/a;->attributeCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v2, v2, 0x2

    .line 688
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v2, 0x4

    invoke-direct {p0, v3, v4}, Lkik/a/f/d/a/a;->ensureCapacity([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    .line 690
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v2, 0x1

    const-string v5, ""

    aput-object v5, v3, v2

    .line 691
    iget-object v2, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v3, v4, 0x1

    const/4 v5, 0x0

    aput-object v5, v2, v4

    .line 692
    iget-object v2, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v3, 0x1

    aput-object v0, v2, v3

    .line 694
    invoke-direct {p0}, Lkik/a/f/d/a/a;->skip()V

    .line 696
    invoke-direct {p0, v6}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v2

    if-eq v2, v9, :cond_8

    .line 697
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attr.value missing f. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 698
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    const-string v2, "1"

    aput-object v2, v0, v4

    goto/16 :goto_0

    .line 701
    :cond_8
    invoke-direct {p0, v9}, Lkik/a/f/d/a/a;->read(C)V

    .line 702
    invoke-direct {p0}, Lkik/a/f/d/a/a;->skip()V

    .line 703
    invoke-direct {p0, v6}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    .line 705
    const/16 v2, 0x27

    if-eq v0, v2, :cond_9

    const/16 v2, 0x22

    if-eq v0, v2, :cond_9

    .line 706
    const-string v0, "attr value delimiter missing!"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    move v0, v1

    .line 713
    :goto_4
    iget v2, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 714
    invoke-direct {p0, v0, v8}, Lkik/a/f/d/a/a;->pushText(IZ)V

    .line 716
    iget-object v3, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    invoke-direct {p0, v2}, Lkik/a/f/d/a/a;->get(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 717
    iput v2, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 719
    if-eq v0, v1, :cond_1

    .line 720
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    goto/16 :goto_0

    .line 710
    :cond_9
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    goto :goto_4

    .line 752
    :cond_a
    const-string v1, ""

    iput-object v1, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    goto/16 :goto_3
.end method

.method private final peek(I)I
    .locals 7

    .prologue
    const/16 v6, 0xa

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 910
    :goto_0
    iget v0, p0, Lkik/a/f/d/a/a;->peekCount:I

    if-lt p1, v0, :cond_6

    .line 914
    iget-object v0, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    array-length v0, v0

    if-gt v0, v5, :cond_0

    .line 915
    iget-object v0, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    move-result v0

    .line 932
    :goto_1
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    .line 933
    iput-boolean v5, p0, Lkik/a/f/d/a/a;->wasCR:Z

    .line 934
    iget-object v0, p0, Lkik/a/f/d/a/a;->peek:[I

    iget v1, p0, Lkik/a/f/d/a/a;->peekCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkik/a/f/d/a/a;->peekCount:I

    aput v6, v0, v1

    goto :goto_0

    .line 917
    :cond_0
    iget v0, p0, Lkik/a/f/d/a/a;->srcPos:I

    iget v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    if-ge v0, v1, :cond_1

    .line 918
    iget-object v0, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    iget v1, p0, Lkik/a/f/d/a/a;->srcPos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkik/a/f/d/a/a;->srcPos:I

    aget-char v0, v0, v1

    goto :goto_1

    .line 921
    :cond_1
    iget-object v0, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    iget-object v2, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    array-length v2, v2

    invoke-virtual {v0, v1, v4, v2}, Ljava/io/Reader;->read([CII)I

    move-result v0

    iput v0, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 922
    iget v0, p0, Lkik/a/f/d/a/a;->srcCount:I

    if-gtz v0, :cond_2

    .line 923
    const/4 v0, -0x1

    .line 929
    :goto_2
    iput v5, p0, Lkik/a/f/d/a/a;->srcPos:I

    goto :goto_1

    .line 926
    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    aget-char v0, v0, v4

    goto :goto_2

    .line 937
    :cond_3
    if-ne v0, v6, :cond_5

    .line 938
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->wasCR:Z

    if-nez v0, :cond_4

    .line 939
    iget-object v0, p0, Lkik/a/f/d/a/a;->peek:[I

    iget v1, p0, Lkik/a/f/d/a/a;->peekCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkik/a/f/d/a/a;->peekCount:I

    aput v6, v0, v1

    .line 946
    :cond_4
    :goto_3
    iput-boolean v4, p0, Lkik/a/f/d/a/a;->wasCR:Z

    goto :goto_0

    .line 943
    :cond_5
    iget-object v1, p0, Lkik/a/f/d/a/a;->peek:[I

    iget v2, p0, Lkik/a/f/d/a/a;->peekCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lkik/a/f/d/a/a;->peekCount:I

    aput v0, v1, v2

    goto :goto_3

    .line 950
    :cond_6
    iget-object v0, p0, Lkik/a/f/d/a/a;->peek:[I

    aget v0, v0, p1

    return v0
.end method

.method private final peekType()I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 587
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 603
    const/4 v0, 0x4

    :goto_0
    :sswitch_0
    return v0

    .line 591
    :sswitch_1
    const/4 v0, 0x6

    goto :goto_0

    .line 593
    :sswitch_2
    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 600
    const/4 v0, 0x2

    goto :goto_0

    .line 595
    :sswitch_3
    const/4 v0, 0x3

    goto :goto_0

    .line 598
    :sswitch_4
    const/16 v0, 0x3e7

    goto :goto_0

    .line 587
    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x26 -> :sswitch_1
        0x3c -> :sswitch_2
    .end sparse-switch

    .line 593
    :sswitch_data_1
    .sparse-switch
        0x21 -> :sswitch_4
        0x2f -> :sswitch_3
        0x3f -> :sswitch_4
    .end sparse-switch
.end method

.method private final push(I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 623
    iget-boolean v2, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    const/16 v0, 0x20

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    and-int/2addr v0, v2

    iput-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    .line 625
    iget v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    iget-object v2, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    array-length v2, v2

    if-ne v0, v2, :cond_0

    .line 626
    iget v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [C

    .line 627
    iget-object v2, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    iget v3, p0, Lkik/a/f/d/a/a;->txtPos:I

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 628
    iput-object v0, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    .line 631
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    iget v1, p0, Lkik/a/f/d/a/a;->txtPos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkik/a/f/d/a/a;->txtPos:I

    int-to-char v2, p1

    aput-char v2, v0, v1

    .line 632
    return-void

    :cond_1
    move v0, v1

    .line 623
    goto :goto_0
.end method

.method private final pushEntity()V
    .locals 6

    .prologue
    const/16 v5, 0x23

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 768
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->push(I)V

    .line 770
    iget v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 773
    :goto_0
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v3

    .line 774
    const/16 v4, 0x3b

    if-eq v3, v4, :cond_6

    .line 775
    const/16 v4, 0x80

    if-ge v3, v4, :cond_5

    const/16 v4, 0x30

    if-lt v3, v4, :cond_0

    const/16 v4, 0x39

    if-le v3, v4, :cond_5

    :cond_0
    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7a

    if-le v3, v4, :cond_5

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x5a

    if-le v3, v4, :cond_5

    :cond_2
    const/16 v4, 0x5f

    if-eq v3, v4, :cond_5

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_5

    if-eq v3, v5, :cond_5

    .line 778
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-nez v0, :cond_3

    .line 779
    const-string v0, "unterminated entity ref"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 782
    :cond_3
    const/4 v0, -0x1

    if-eq v3, v0, :cond_4

    .line 783
    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->push(I)V

    .line 817
    :cond_4
    :goto_1
    return-void

    .line 788
    :cond_5
    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->push(I)V

    goto :goto_0

    .line 791
    :cond_6
    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->get(I)Ljava/lang/String;

    move-result-object v3

    .line 792
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 793
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->token:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v4, 0x6

    if-ne v0, v4, :cond_7

    .line 794
    iput-object v3, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 797
    :cond_7
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_9

    .line 798
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x78

    if-ne v0, v2, :cond_8

    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 799
    :goto_2
    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->push(I)V

    goto :goto_1

    .line 798
    :cond_8
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_2

    .line 803
    :cond_9
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 805
    if-nez v0, :cond_a

    :goto_3
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->unresolved:Z

    .line 807
    iget-boolean v1, p0, Lkik/a/f/d/a/a;->unresolved:Z

    if-eqz v1, :cond_b

    .line 808
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->token:Z

    if-nez v0, :cond_4

    .line 809
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unresolved: &"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    move v1, v2

    .line 805
    goto :goto_3

    .line 813
    :cond_b
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 814
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->push(I)V

    .line 813
    add-int/lit8 v2, v2, 0x1

    goto :goto_4
.end method

.method private final pushText(IZ)V
    .locals 8

    .prologue
    const/16 v7, 0x5d

    const/16 v6, 0x3e

    const/4 v5, 0x2

    const/16 v4, 0x20

    const/4 v1, 0x0

    .line 828
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    move v2, v0

    move v0, v1

    .line 831
    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    if-eq v2, p1, :cond_5

    .line 833
    if-ne p1, v4, :cond_0

    .line 834
    if-le v2, v4, :cond_5

    if-eq v2, v6, :cond_5

    .line 835
    :cond_0
    const/16 v3, 0x26

    if-ne v2, v3, :cond_2

    .line 840
    if-eqz p2, :cond_5

    .line 841
    invoke-direct {p0}, Lkik/a/f/d/a/a;->pushEntity()V

    .line 854
    :goto_1
    if-ne v2, v6, :cond_1

    if-lt v0, v5, :cond_1

    if-eq p1, v7, :cond_1

    .line 855
    const-string v3, "Illegal: ]]>"

    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 858
    :cond_1
    if-ne v2, v7, :cond_4

    .line 859
    add-int/lit8 v0, v0, 0x1

    .line 865
    :goto_2
    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v2

    goto :goto_0

    .line 846
    :cond_2
    const/16 v3, 0xa

    if-ne v2, v3, :cond_3

    iget v3, p0, Lkik/a/f/d/a/a;->type:I

    if-ne v3, v5, :cond_3

    .line 847
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    .line 848
    invoke-direct {p0, v4}, Lkik/a/f/d/a/a;->push(I)V

    goto :goto_1

    .line 851
    :cond_3
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v3

    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->push(I)V

    goto :goto_1

    :cond_4
    move v0, v1

    .line 862
    goto :goto_2

    .line 867
    :cond_5
    return-void
.end method

.method private final read()I
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 881
    iget v0, p0, Lkik/a/f/d/a/a;->peekCount:I

    if-nez v0, :cond_1

    .line 882
    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    .line 892
    :goto_0
    iget v1, p0, Lkik/a/f/d/a/a;->peekCount:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lkik/a/f/d/a/a;->peekCount:I

    .line 894
    iget v1, p0, Lkik/a/f/d/a/a;->column:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->column:I

    .line 896
    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 898
    iget v1, p0, Lkik/a/f/d/a/a;->line:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->line:I

    .line 899
    iput v4, p0, Lkik/a/f/d/a/a;->column:I

    .line 902
    :cond_0
    return v0

    .line 885
    :cond_1
    iget-object v0, p0, Lkik/a/f/d/a/a;->peek:[I

    aget v0, v0, v3

    .line 886
    iget-object v1, p0, Lkik/a/f/d/a/a;->peek:[I

    iget-object v2, p0, Lkik/a/f/d/a/a;->peek:[I

    aget v2, v2, v4

    aput v2, v1, v3

    goto :goto_0
.end method

.method private final read(C)V
    .locals 3

    .prologue
    .line 871
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v0

    .line 872
    if-eq v0, p1, :cond_0

    .line 873
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' actual: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 875
    :cond_0
    return-void
.end method

.method private final readName()Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0x5f

    const/16 v6, 0x5a

    const/16 v5, 0x41

    const/16 v4, 0x3a

    const/4 v3, 0x0

    .line 956
    iget v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 957
    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v1

    .line 958
    const/16 v2, 0x61

    if-lt v1, v2, :cond_0

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    :cond_0
    if-lt v1, v5, :cond_1

    if-le v1, v6, :cond_2

    :cond_1
    if-eq v1, v7, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0xc0

    if-ge v1, v2, :cond_2

    iget-boolean v1, p0, Lkik/a/f/d/a/a;->relaxed:Z

    if-nez v1, :cond_2

    .line 959
    const-string v1, "name expected"

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->error(Ljava/lang/String;)V

    .line 963
    :cond_2
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    move-result v1

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->push(I)V

    .line 964
    invoke-direct {p0, v3}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v1

    .line 965
    const/16 v2, 0x61

    if-lt v1, v2, :cond_3

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    :cond_3
    if-lt v1, v5, :cond_4

    if-le v1, v6, :cond_2

    :cond_4
    const/16 v2, 0x30

    if-lt v1, v2, :cond_5

    const/16 v2, 0x39

    if-le v1, v2, :cond_2

    :cond_5
    if-eq v1, v7, :cond_2

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0x2e

    if-eq v1, v2, :cond_2

    const/16 v2, 0xb7

    if-ge v1, v2, :cond_2

    .line 967
    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->get(I)Ljava/lang/String;

    move-result-object v1

    .line 968
    iput v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 969
    return-object v1
.end method

.method private final skip()V
    .locals 2

    .prologue
    .line 976
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->peek(I)I

    move-result v0

    .line 977
    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 978
    invoke-direct {p0}, Lkik/a/f/d/a/a;->read()I

    goto :goto_0

    .line 982
    :cond_0
    return-void
.end method


# virtual methods
.method public defineEntityReplacementText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1159
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 1160
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "entity replacement text must be defined after setInput!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1162
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    return-void
.end method

.method public getAttributeCount()I
    .locals 1

    .prologue
    .line 1351
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    return v0
.end method

.method public getAttributeName(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1374
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-lt p1, v0, :cond_0

    .line 1375
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1377
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeNamespace(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1366
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-lt p1, v0, :cond_0

    .line 1367
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1369
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributePrefix(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1382
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-lt p1, v0, :cond_0

    .line 1383
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1385
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeType(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1356
    const-string v0, "CDATA"

    return-object v0
.end method

.method public getAttributeValue(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1390
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    if-lt p1, v0, :cond_0

    .line 1391
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1393
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1399
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x4

    :goto_0
    if-ltz v0, :cond_2

    .line 1400
    iget-object v1, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1401
    :cond_0
    iget-object v1, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    aget-object v0, v1, v0

    .line 1405
    :goto_1
    return-object v0

    .line 1399
    :cond_1
    add-int/lit8 v0, v0, -0x4

    goto :goto_0

    .line 1405
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getColumnNumber()I
    .locals 1

    .prologue
    .line 1292
    iget v0, p0, Lkik/a/f/d/a/a;->column:I

    return v0
.end method

.method public getDepth()I
    .locals 1

    .prologue
    .line 1222
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    return v0
.end method

.method public getEventType()I
    .locals 1

    .prologue
    .line 1410
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    return v0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1141
    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1142
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->processNsp:Z

    .line 1148
    :cond_0
    :goto_0
    return v0

    .line 1144
    :cond_1
    const-string v1, "relaxed"

    invoke-direct {p0, p1, v0, v1}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1145
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->relaxed:Z

    goto :goto_0
.end method

.method public getInputEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1154
    iget-object v0, p0, Lkik/a/f/d/a/a;->encoding:Ljava/lang/String;

    return-object v0
.end method

.method public getLineNumber()I
    .locals 1

    .prologue
    .line 1287
    iget v0, p0, Lkik/a/f/d/a/a;->line:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1333
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1328
    iget-object v0, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1200
    const-string v0, "xml"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1201
    const-string v0, "http://www.w3.org/XML/1998/namespace"

    .line 1217
    :goto_0
    return-object v0

    .line 1203
    :cond_0
    const-string v0, "xmlns"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1204
    const-string v0, "http://www.w3.org/2000/xmlns/"

    goto :goto_0

    .line 1207
    :cond_1
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    invoke-virtual {p0, v0}, Lkik/a/f/d/a/a;->getNamespaceCount(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x2

    :goto_1
    if-ltz v0, :cond_4

    .line 1208
    if-nez p1, :cond_2

    .line 1209
    iget-object v1, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    aget-object v1, v1, v0

    if-nez v1, :cond_3

    .line 1210
    iget-object v1, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    goto :goto_0

    .line 1213
    :cond_2
    iget-object v1, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1214
    iget-object v1, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    goto :goto_0

    .line 1207
    :cond_3
    add-int/lit8 v0, v0, -0x2

    goto :goto_1

    .line 1217
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNamespaceCount(I)I
    .locals 1

    .prologue
    .line 1181
    iget v0, p0, Lkik/a/f/d/a/a;->depth:I

    if-le p1, v0, :cond_0

    .line 1182
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 1184
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/a;->nspCounts:[I

    aget v0, v0, p1

    return v0
.end method

.method public getNamespacePrefix(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1189
    iget-object v0, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getNamespaceUri(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1194
    iget-object v0, p0, Lkik/a/f/d/a/a;->nspStack:[Ljava/lang/String;

    shl-int/lit8 v1, p1, 0x1

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getPositionDescription()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/16 v5, 0x10

    const/4 v4, 0x3

    const/4 v1, 0x0

    .line 1228
    new-instance v2, Ljava/lang/StringBuffer;

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    sget-object v3, Lkik/a/f/d/a/a;->a:[Ljava/lang/String;

    array-length v3, v3

    if-ge v0, v3, :cond_5

    sget-object v0, Lkik/a/f/d/a/a;->a:[Ljava/lang/String;

    iget v3, p0, Lkik/a/f/d/a/a;->type:I

    aget-object v0, v0, v3

    :goto_0
    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 1229
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1231
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    if-ne v0, v4, :cond_9

    .line 1232
    :cond_0
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->degenerated:Z

    if-eqz v0, :cond_1

    .line 1233
    const-string v0, "(empty) "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1235
    :cond_1
    const/16 v0, 0x3c

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1236
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    if-ne v0, v4, :cond_2

    .line 1237
    const/16 v0, 0x2f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1240
    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 1241
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "{"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "}"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1243
    :cond_3
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1245
    iget v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    shl-int/lit8 v3, v0, 0x2

    move v0, v1

    .line 1246
    :goto_1
    if-ge v0, v3, :cond_6

    .line 1247
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1248
    iget-object v1, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v4, v0, 0x1

    aget-object v1, v1, v4

    if-eqz v1, :cond_4

    .line 1249
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "{"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "}"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1251
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "=\'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lkik/a/f/d/a/a;->attributes:[Ljava/lang/String;

    add-int/lit8 v5, v0, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1246
    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    .line 1228
    :cond_5
    const-string v0, "unknown"

    goto/16 :goto_0

    .line 1254
    :cond_6
    const/16 v0, 0x3e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 1273
    :cond_7
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lkik/a/f/d/a/a;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lkik/a/f/d/a/a;->column:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1274
    iget-object v0, p0, Lkik/a/f/d/a/a;->location:Ljava/lang/Object;

    if-eqz v0, :cond_d

    .line 1275
    const-string v0, " in "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1276
    iget-object v0, p0, Lkik/a/f/d/a/a;->location:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 1282
    :cond_8
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1256
    :cond_9
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v3, 0x7

    if-eq v0, v3, :cond_7

    .line 1259
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v3, 0x4

    if-eq v0, v3, :cond_a

    .line 1260
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1262
    :cond_a
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    if-eqz v0, :cond_b

    .line 1263
    const-string v0, "(whitespace)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1266
    :cond_b
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    .line 1267
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v5, :cond_c

    .line 1268
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1270
    :cond_c
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 1278
    :cond_d
    iget-object v0, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    if-eqz v0, :cond_8

    .line 1279
    const-string v0, " in "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1280
    iget-object v0, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1338
    iget-object v0, p0, Lkik/a/f/d/a/a;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1167
    const-string v0, "xmldecl-version"

    invoke-direct {p0, p1, v1, v0}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1168
    iget-object v0, p0, Lkik/a/f/d/a/a;->version:Ljava/lang/String;

    .line 1176
    :goto_0
    return-object v0

    .line 1170
    :cond_0
    const-string v0, "xmldecl-standalone"

    invoke-direct {p0, p1, v1, v0}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1171
    iget-object v0, p0, Lkik/a/f/d/a/a;->standalone:Ljava/lang/Boolean;

    goto :goto_0

    .line 1173
    :cond_1
    const-string v0, "location"

    invoke-direct {p0, p1, v1, v0}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1174
    iget-object v0, p0, Lkik/a/f/d/a/a;->location:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/a/f/d/a/a;->location:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1176
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getText()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1305
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lkik/a/f/d/a/a;->unresolved:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->get(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTextCharacters([I)[C
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1310
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 1311
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1312
    aput v2, p1, v2

    .line 1313
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    aput v0, p1, v3

    .line 1314
    iget-object v0, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 1323
    :goto_0
    return-object v0

    .line 1316
    :cond_0
    aput v2, p1, v2

    .line 1317
    iget v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    aput v0, p1, v3

    .line 1318
    iget-object v0, p0, Lkik/a/f/d/a/a;->txtBuf:[C

    goto :goto_0

    .line 1321
    :cond_1
    aput v4, p1, v2

    .line 1322
    aput v4, p1, v3

    .line 1323
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isAttributeDefault(I)Z
    .locals 1

    .prologue
    .line 1361
    const/4 v0, 0x0

    return v0
.end method

.method public isEmptyElementTag()Z
    .locals 2

    .prologue
    .line 1343
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1344
    const-string v0, "Wrong event type"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1346
    :cond_0
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->degenerated:Z

    return v0
.end method

.method public isWhitespace()Z
    .locals 2

    .prologue
    .line 1297
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 1298
    const-string v0, "Wrong event type"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1300
    :cond_0
    iget-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    return v0
.end method

.method public next()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x4

    .line 1416
    iput v1, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 1417
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    .line 1418
    const/16 v0, 0x270f

    .line 1419
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->token:Z

    .line 1422
    :cond_0
    invoke-direct {p0}, Lkik/a/f/d/a/a;->nextImpl()V

    .line 1423
    iget v1, p0, Lkik/a/f/d/a/a;->type:I

    if-ge v1, v0, :cond_1

    .line 1424
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    .line 1427
    :cond_1
    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    if-lt v0, v2, :cond_2

    invoke-direct {p0}, Lkik/a/f/d/a/a;->peekType()I

    move-result v1

    if-ge v1, v2, :cond_0

    .line 1430
    :cond_2
    iput v0, p0, Lkik/a/f/d/a/a;->type:I

    .line 1431
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    if-le v0, v2, :cond_3

    .line 1432
    iput v2, p0, Lkik/a/f/d/a/a;->type:I

    .line 1435
    :cond_3
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    return v0
.end method

.method public nextTag()I
    .locals 2

    .prologue
    .line 1455
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->next()I

    .line 1456
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    if-eqz v0, :cond_0

    .line 1457
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->next()I

    .line 1460
    :cond_0
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 1461
    const-string v0, "unexpected type"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1464
    :cond_1
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    return v0
.end method

.method public nextText()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1477
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1478
    const-string v0, "precondition: START_TAG"

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1481
    :cond_0
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->next()I

    .line 1485
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 1486
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->getText()Ljava/lang/String;

    move-result-object v0

    .line 1487
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->next()I

    .line 1493
    :goto_0
    iget v1, p0, Lkik/a/f/d/a/a;->type:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    .line 1494
    const-string v1, "END_TAG expected"

    invoke-direct {p0, v1}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1497
    :cond_1
    return-object v0

    .line 1490
    :cond_2
    const-string v0, ""

    goto :goto_0
.end method

.method public nextToken()I
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1441
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->isWhitespace:Z

    .line 1442
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/f/d/a/a;->txtPos:I

    .line 1444
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->token:Z

    .line 1445
    invoke-direct {p0}, Lkik/a/f/d/a/a;->nextImpl()V

    .line 1446
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    return v0
.end method

.method public require(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1470
    iget v0, p0, Lkik/a/f/d/a/a;->type:I

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lkik/a/f/d/a/a;->getNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lkik/a/f/d/a/a;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1471
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkik/a/f/d/a/a;->a:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    .line 1473
    :cond_2
    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 1502
    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1503
    iput-boolean p2, p0, Lkik/a/f/d/a/a;->processNsp:Z

    .line 1511
    :goto_0
    return-void

    .line 1505
    :cond_0
    const/4 v0, 0x0

    const-string v1, "relaxed"

    invoke-direct {p0, p1, v0, v1}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1506
    iput-boolean p2, p0, Lkik/a/f/d/a/a;->relaxed:Z

    goto :goto_0

    .line 1509
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unsupported feature: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/a;->exception(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setInput(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v0, 0x0

    .line 1021
    iput v0, p0, Lkik/a/f/d/a/a;->srcPos:I

    .line 1022
    iput v0, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 1025
    if-nez p1, :cond_0

    .line 1026
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 1031
    :cond_0
    if-nez p2, :cond_9

    move v1, v0

    .line 1036
    :goto_0
    :try_start_0
    iget v0, p0, Lkik/a/f/d/a/a;->srcCount:I

    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    .line 1037
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 1038
    if-eq v2, v5, :cond_1

    .line 1039
    shl-int/lit8 v0, v1, 0x8

    or-int/2addr v0, v2

    .line 1042
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    iget v3, p0, Lkik/a/f/d/a/a;->srcCount:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lkik/a/f/d/a/a;->srcCount:I

    int-to-char v2, v2

    aput-char v2, v1, v3

    move v1, v0

    .line 1043
    goto :goto_0

    .line 1045
    :cond_1
    iget v0, p0, Lkik/a/f/d/a/a;->srcCount:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_9

    .line 1046
    sparse-switch v1, :sswitch_data_0

    :cond_2
    move-object v0, p2

    .line 1106
    :goto_1
    const/high16 v2, -0x10000

    and-int/2addr v2, v1

    const/high16 v3, -0x1010000

    if-ne v2, v3, :cond_7

    .line 1107
    const-string v0, "UTF-16BE"

    .line 1108
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v4, 0x2

    aget-char v3, v3, v4

    shl-int/lit8 v3, v3, 0x8

    iget-object v4, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v5, 0x3

    aget-char v4, v4, v5

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 1109
    const/4 v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 1125
    :cond_3
    :goto_2
    if-nez v0, :cond_4

    .line 1126
    const-string v0, "UTF-8"

    .line 1129
    :cond_4
    iget v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 1130
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lkik/a/f/d/a/a;->setInput(Ljava/io/Reader;)V

    .line 1131
    iput-object p2, p0, Lkik/a/f/d/a/a;->encoding:Ljava/lang/String;

    .line 1132
    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 1136
    return-void

    .line 1048
    :sswitch_0
    const-string v0, "UTF-32BE"

    .line 1049
    const/4 v1, 0x0

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1134
    :catch_0
    move-exception v0

    .line 1135
    new-instance v1, Lorg/d/a/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid stream or encoding: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p0, v0}, Lorg/d/a/b;-><init>(Ljava/lang/String;Lorg/d/a/a;Ljava/lang/Throwable;)V

    throw v1

    .line 1053
    :sswitch_1
    :try_start_1
    const-string v0, "UTF-32LE"

    .line 1054
    const/4 v1, 0x0

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto :goto_2

    .line 1058
    :sswitch_2
    const-string v0, "UTF-32BE"

    .line 1059
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1060
    const/4 v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto :goto_2

    .line 1064
    :sswitch_3
    const-string v0, "UTF-32LE"

    .line 1065
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1066
    const/4 v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto :goto_2

    .line 1070
    :sswitch_4
    const-string v0, "UTF-16BE"

    .line 1071
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1072
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x1

    const/16 v3, 0x3f

    aput-char v3, v1, v2

    .line 1073
    const/4 v1, 0x2

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto :goto_2

    .line 1077
    :sswitch_5
    const-string v0, "UTF-16LE"

    .line 1078
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    const/16 v3, 0x3c

    aput-char v3, v1, v2

    .line 1079
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x1

    const/16 v3, 0x3f

    aput-char v3, v1, v2

    .line 1080
    const/4 v1, 0x2

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto :goto_2

    .line 1085
    :cond_5
    :sswitch_6
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 1086
    if-eq v0, v5, :cond_2

    .line 1087
    iget-object v2, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    iget v3, p0, Lkik/a/f/d/a/a;->srcCount:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lkik/a/f/d/a/a;->srcCount:I

    int-to-char v4, v0

    aput-char v4, v2, v3

    .line 1090
    const/16 v2, 0x3e

    if-ne v0, v2, :cond_5

    .line 1091
    new-instance v2, Ljava/lang/String;

    iget-object v0, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v3, 0x0

    iget v4, p0, Lkik/a/f/d/a/a;->srcCount:I

    invoke-direct {v2, v0, v3, v4}, Ljava/lang/String;-><init>([CII)V

    .line 1092
    const-string v0, "encoding"

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 1093
    if-eq v0, v5, :cond_2

    .line 1094
    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-eq v3, v4, :cond_6

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x27

    if-eq v3, v4, :cond_6

    .line 1095
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1097
    :cond_6
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1098
    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 1099
    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 1111
    :cond_7
    const/high16 v2, -0x10000

    and-int/2addr v2, v1

    const/high16 v3, -0x20000

    if-ne v2, v3, :cond_8

    .line 1112
    const-string v0, "UTF-16LE"

    .line 1113
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v4, 0x3

    aget-char v3, v3, v4

    shl-int/lit8 v3, v3, 0x8

    iget-object v4, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v5, 0x2

    aget-char v4, v4, v5

    or-int/2addr v3, v4

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 1114
    const/4 v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    goto/16 :goto_2

    .line 1116
    :cond_8
    and-int/lit16 v1, v1, -0x100

    const v2, -0x10444100

    if-ne v1, v2, :cond_3

    .line 1117
    const-string v0, "UTF-8"

    .line 1118
    iget-object v1, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/a/f/d/a/a;->srcBuf:[C

    const/4 v4, 0x3

    aget-char v3, v3, v4

    aput-char v3, v1, v2

    .line 1119
    const/4 v1, 0x1

    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :cond_9
    move-object v0, p2

    goto/16 :goto_2

    .line 1046
    nop

    :sswitch_data_0
    .sparse-switch
        -0x20000 -> :sswitch_1
        0x3c -> :sswitch_2
        0xfeff -> :sswitch_0
        0x3c003f -> :sswitch_4
        0x3c000000 -> :sswitch_3
        0x3c003f00 -> :sswitch_5
        0x3c3f786d -> :sswitch_6
    .end sparse-switch
.end method

.method public setInput(Ljava/io/Reader;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 988
    iput-object p1, p0, Lkik/a/f/d/a/a;->reader:Ljava/io/Reader;

    .line 990
    const/4 v0, 0x1

    iput v0, p0, Lkik/a/f/d/a/a;->line:I

    .line 991
    iput v1, p0, Lkik/a/f/d/a/a;->column:I

    .line 992
    iput v1, p0, Lkik/a/f/d/a/a;->type:I

    .line 993
    iput-object v2, p0, Lkik/a/f/d/a/a;->name:Ljava/lang/String;

    .line 994
    iput-object v2, p0, Lkik/a/f/d/a/a;->namespace:Ljava/lang/String;

    .line 995
    iput-boolean v1, p0, Lkik/a/f/d/a/a;->degenerated:Z

    .line 996
    const/4 v0, -0x1

    iput v0, p0, Lkik/a/f/d/a/a;->attributeCount:I

    .line 997
    iput-object v2, p0, Lkik/a/f/d/a/a;->encoding:Ljava/lang/String;

    .line 998
    iput-object v2, p0, Lkik/a/f/d/a/a;->version:Ljava/lang/String;

    .line 999
    iput-object v2, p0, Lkik/a/f/d/a/a;->standalone:Ljava/lang/Boolean;

    .line 1001
    if-nez p1, :cond_0

    .line 1016
    :goto_0
    return-void

    .line 1005
    :cond_0
    iput v1, p0, Lkik/a/f/d/a/a;->srcPos:I

    .line 1006
    iput v1, p0, Lkik/a/f/d/a/a;->srcCount:I

    .line 1007
    iput v1, p0, Lkik/a/f/d/a/a;->peekCount:I

    .line 1008
    iput v1, p0, Lkik/a/f/d/a/a;->depth:I

    .line 1010
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    .line 1011
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    const-string v1, "amp"

    const-string v2, "&"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    const-string v1, "apos"

    const-string v2, "\'"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    const-string v1, "gt"

    const-string v2, ">"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1014
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    const-string v1, "lt"

    const-string v2, "<"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    iget-object v0, p0, Lkik/a/f/d/a/a;->entityMap:Ljava/util/Hashtable;

    const-string v1, "quot"

    const-string v2, "\""

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1515
    const/4 v0, 0x1

    const-string v1, "location"

    invoke-direct {p0, p1, v0, v1}, Lkik/a/f/d/a/a;->isProp(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1516
    iput-object p2, p0, Lkik/a/f/d/a/a;->location:Ljava/lang/Object;

    return-void

    .line 1519
    :cond_0
    new-instance v0, Lorg/d/a/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unsupported property: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public skipSubTree()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x2

    .line 1533
    invoke-virtual {p0, v3, v0, v0}, Lkik/a/f/d/a/a;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 1534
    const/4 v0, 0x1

    .line 1535
    :cond_0
    :goto_0
    if-lez v0, :cond_2

    .line 1536
    invoke-virtual {p0}, Lkik/a/f/d/a/a;->next()I

    move-result v1

    .line 1537
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 1538
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1540
    :cond_1
    if-ne v1, v3, :cond_0

    .line 1541
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1544
    :cond_2
    return-void
.end method
