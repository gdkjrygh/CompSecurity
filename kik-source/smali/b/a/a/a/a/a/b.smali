.class public final Lb/a/a/a/a/a/b;
.super Lb/a/a/a/a/a/a;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/a/a/a/a/a/b;-><init>(B)V

    .line 28
    return-void
.end method

.method private constructor <init>(B)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lb/a/a/a/a/a/a;-><init>()V

    .line 32
    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lb/a/a/a/a/a/b;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected final a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lb/a/a/a/a/a/b;->a:Ljava/lang/Object;

    .line 47
    return-void
.end method
