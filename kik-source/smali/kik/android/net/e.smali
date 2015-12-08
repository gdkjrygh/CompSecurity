.class public final Lkik/android/net/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/p;


# instance fields
.field private final a:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lkik/android/net/e;->a:Ljava/net/Socket;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/android/net/e;->a:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 23
    return-void
.end method
