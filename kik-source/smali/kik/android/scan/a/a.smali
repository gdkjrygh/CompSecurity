.class public final Lkik/android/scan/a/a;
.super Lkik/android/scan/a/b;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kik/scan/RemoteKikCode;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lkik/android/scan/a/b;-><init>(Lcom/kik/scan/RemoteKikCode;Ljava/lang/String;)V

    .line 17
    iput p3, p0, Lkik/android/scan/a/a;->a:I

    .line 18
    iput-object p4, p0, Lkik/android/scan/a/a;->b:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lkik/android/scan/a/a;->a:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lkik/android/scan/a/a;->b:Ljava/lang/String;

    return-object v0
.end method
