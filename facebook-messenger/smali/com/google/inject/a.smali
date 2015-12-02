.class public Lcom/google/inject/a;
.super Ljava/lang/Object;
.source "Key.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/inject/c;

.field private final b:Lcom/google/inject/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/f",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    sget-object v0, Lcom/google/inject/e;->INSTANCE:Lcom/google/inject/e;

    iput-object v0, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/f;->b(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    .line 115
    invoke-direct {p0}, Lcom/google/inject/a;->d()I

    move-result v0

    iput v0, p0, Lcom/google/inject/a;->c:I

    .line 116
    return-void
.end method

.method private constructor <init>(Lcom/google/inject/f;Lcom/google/inject/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/f",
            "<TT;>;",
            "Lcom/google/inject/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p2, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    .line 131
    invoke-static {p1}, Lcom/google/inject/a/d;->a(Lcom/google/inject/f;)Lcom/google/inject/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    .line 132
    invoke-direct {p0}, Lcom/google/inject/a;->d()I

    move-result v0

    iput v0, p0, Lcom/google/inject/a;->c:I

    .line 133
    return-void
.end method

.method private constructor <init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V
    .locals 1

    .prologue
    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p2, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    .line 124
    invoke-static {p1}, Lcom/google/inject/f;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/a/d;->a(Lcom/google/inject/f;)Lcom/google/inject/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    .line 125
    invoke-direct {p0}, Lcom/google/inject/a;->d()I

    move-result v0

    iput v0, p0, Lcom/google/inject/a;->c:I

    .line 126
    return-void
.end method

.method public static a(Lcom/google/inject/f;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/f",
            "<TS;>;)",
            "Lcom/google/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 261
    new-instance v0, Lcom/google/inject/a;

    sget-object v1, Lcom/google/inject/e;->INSTANCE:Lcom/google/inject/e;

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Lcom/google/inject/f;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Lcom/google/inject/f;Ljava/lang/Class;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/f",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 269
    new-instance v0, Lcom/google/inject/a;

    invoke-static {p1}, Lcom/google/inject/a;->b(Ljava/lang/Class;)Lcom/google/inject/c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Lcom/google/inject/f;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Lcom/google/inject/f;Ljava/lang/annotation/Annotation;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/f",
            "<TS;>;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 277
    new-instance v0, Lcom/google/inject/a;

    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/annotation/Annotation;)Lcom/google/inject/c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Lcom/google/inject/f;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Class;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 217
    new-instance v0, Lcom/google/inject/a;

    sget-object v1, Lcom/google/inject/e;->INSTANCE:Lcom/google/inject/e;

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 225
    new-instance v0, Lcom/google/inject/a;

    invoke-static {p1}, Lcom/google/inject/a;->b(Ljava/lang/Class;)Lcom/google/inject/c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/reflect/Type;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/google/inject/a",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 239
    new-instance v0, Lcom/google/inject/a;

    sget-object v1, Lcom/google/inject/e;->INSTANCE:Lcom/google/inject/e;

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/a",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 247
    new-instance v0, Lcom/google/inject/a;

    invoke-static {p1}, Lcom/google/inject/a;->b(Ljava/lang/Class;)Lcom/google/inject/c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/reflect/Type;Ljava/lang/annotation/Annotation;)Lcom/google/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/a",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 254
    new-instance v0, Lcom/google/inject/a;

    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/annotation/Annotation;)Lcom/google/inject/c;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/a;-><init>(Ljava/lang/reflect/Type;Lcom/google/inject/c;)V

    return-object v0
.end method

.method static a(Ljava/lang/annotation/Annotation;)Lcom/google/inject/c;
    .locals 2

    .prologue
    .line 340
    const-string v0, "annotation"

    invoke-static {p0, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    .line 348
    invoke-static {v1}, Lcom/google/inject/a/a;->a(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    new-instance v0, Lcom/google/inject/d;

    invoke-direct {v0, v1, p0}, Lcom/google/inject/d;-><init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    .line 352
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/b;

    invoke-static {p0}, Lcom/google/inject/a/a;->a(Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/b;-><init>(Ljava/lang/annotation/Annotation;)V

    goto :goto_0
.end method

.method static b(Ljava/lang/Class;)Lcom/google/inject/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/c;"
        }
    .end annotation

    .prologue
    .line 359
    const-string v0, "annotation type"

    invoke-static {p0, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    new-instance v0, Lcom/google/inject/d;

    invoke-static {p0}, Lcom/google/inject/a/a;->c(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/d;-><init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method private d()I
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    invoke-virtual {v0}, Lcom/google/inject/f;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a()Lcom/google/inject/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/f",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 143
    iget-object v0, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 150
    iget-object v0, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    invoke-interface {v0}, Lcom/google/inject/c;->getAnnotationType()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/annotation/Annotation;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    invoke-interface {v0}, Lcom/google/inject/c;->getAnnotation()Ljava/lang/annotation/Annotation;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 186
    if-ne p1, p0, :cond_1

    .line 193
    :cond_0
    :goto_0
    return v0

    .line 189
    :cond_1
    instance-of v2, p1, Lcom/google/inject/a;

    if-nez v2, :cond_2

    move v0, v1

    .line 190
    goto :goto_0

    .line 192
    :cond_2
    check-cast p1, Lcom/google/inject/a;

    .line 193
    iget-object v2, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    iget-object v3, p1, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    iget-object v3, p1, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    invoke-virtual {v2, v3}, Lcom/google/inject/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 198
    iget v0, p0, Lcom/google/inject/a;->c:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Key[type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/a;->b:Lcom/google/inject/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", annotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/a;->a:Lcom/google/inject/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
