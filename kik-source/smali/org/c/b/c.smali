.class public final Lorg/c/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field private static final b:Lorg/c/b/c;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final d:Lorg/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    new-instance v0, Lorg/c/b/c;

    invoke-direct {v0}, Lorg/c/b/c;-><init>()V

    sput-object v0, Lorg/c/b/c;->b:Lorg/c/b/c;

    .line 64
    const-string v0, "1.6"

    sput-object v0, Lorg/c/b/c;->a:Ljava/lang/String;

    .line 66
    const-class v0, Lorg/c/b/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/c/b/c;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Lorg/c/b/b;

    invoke-direct {v0}, Lorg/c/b/b;-><init>()V

    iput-object v0, p0, Lorg/c/b/c;->d:Lorg/c/a;

    .line 77
    return-void
.end method

.method public static final a()Lorg/c/b/c;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lorg/c/b/c;->b:Lorg/c/b/c;

    return-object v0
.end method


# virtual methods
.method public final b()Lorg/c/a;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lorg/c/b/c;->d:Lorg/c/a;

    return-object v0
.end method
