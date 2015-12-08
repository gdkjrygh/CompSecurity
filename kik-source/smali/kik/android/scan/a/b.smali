.class public Lkik/android/scan/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/scan/RemoteKikCode;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kik/scan/RemoteKikCode;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lkik/android/scan/a/b;->a:Lcom/kik/scan/RemoteKikCode;

    .line 16
    iput-object p2, p0, Lkik/android/scan/a/b;->b:Ljava/lang/String;

    .line 17
    return-void
.end method


# virtual methods
.method public final c()Lcom/kik/scan/RemoteKikCode;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lkik/android/scan/a/b;->a:Lcom/kik/scan/RemoteKikCode;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/scan/a/b;->b:Ljava/lang/String;

    return-object v0
.end method
