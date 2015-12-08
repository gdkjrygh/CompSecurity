.class public final Lkik/a/f/r;
.super Lkik/a/f/h;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    const-string v0, "simplean"

    invoke-direct {p0, v0}, Lkik/a/f/r;-><init>(Ljava/lang/String;)V

    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lkik/a/f/h;-><init>()V

    .line 14
    iput-object p1, p0, Lkik/a/f/r;->b:Ljava/lang/String;

    .line 15
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/a/f/r;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const-string v0, "https://ws.piranhakik.com"

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    const-string v0, "http://profilepicsup.piranhakik.com/profilepics"

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    const-string v0, "http://platform.piranhakik.com"

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    const-string v0, "https://platform.piranhakik.com/content/files/"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    const-string v0, "https://platform.piranhakik.com/content/files/"

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    const-string v0, "https://platform.piranhakik.com/clientmetrics/v1/data"

    return-object v0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 86
    const/16 v0, 0x6e

    return v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    const-string v0, "piranhakik.com"

    return-object v0
.end method
