.class public Lkik/a/d/a/h;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 9
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 10
    iput-object p1, p0, Lkik/a/d/a/h;->a:Ljava/lang/String;

    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lkik/a/d/a/h;->a:Ljava/lang/String;

    return-object v0
.end method
