.class public final Lkik/a/d/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lkik/a/d/l;->a:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lkik/a/d/l;->b:Ljava/lang/String;

    .line 19
    iput-boolean p3, p0, Lkik/a/d/l;->c:Z

    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/a/d/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/a/d/l;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lkik/a/d/l;->c:Z

    return v0
.end method
