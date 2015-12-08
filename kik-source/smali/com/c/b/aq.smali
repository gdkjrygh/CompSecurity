.class public Lcom/c/b/aq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Z

.field private static final c:Lcom/c/b/aq;


# instance fields
.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    sput-boolean v1, Lcom/c/b/aq;->a:Z

    .line 159
    new-instance v0, Lcom/c/b/aq;

    invoke-direct {v0, v1}, Lcom/c/b/aq;-><init>(B)V

    sput-object v0, Lcom/c/b/aq;->c:Lcom/c/b/aq;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/aq;->b:Ljava/util/Map;

    .line 141
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/aq;->b:Ljava/util/Map;

    .line 158
    return-void
.end method

.method constructor <init>(Lcom/c/b/aq;)V
    .locals 1

    .prologue
    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    sget-object v0, Lcom/c/b/aq;->c:Lcom/c/b/aq;

    if-ne p1, v0, :cond_0

    .line 145
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/aq;->b:Ljava/util/Map;

    .line 150
    :goto_0
    return-void

    .line 147
    :cond_0
    iget-object v0, p1, Lcom/c/b/aq;->b:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/aq;->b:Ljava/util/Map;

    goto :goto_0
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 83
    sget-boolean v0, Lcom/c/b/aq;->a:Z

    return v0
.end method

.method public static d()Lcom/c/b/aq;
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/c/b/aq;->c:Lcom/c/b/aq;

    return-object v0
.end method
