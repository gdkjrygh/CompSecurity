.class final Lkik/android/net/communicator/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/net/communicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field final synthetic c:Lkik/android/net/communicator/a;


# direct methods
.method public constructor <init>(Lkik/android/net/communicator/a;I)V
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;ILjava/lang/Object;)V

    .line 189
    return-void
.end method

.method public constructor <init>(Lkik/android/net/communicator/a;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lkik/android/net/communicator/a$e;->c:Lkik/android/net/communicator/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput p2, p0, Lkik/android/net/communicator/a$e;->a:I

    .line 183
    iput-object p3, p0, Lkik/android/net/communicator/a$e;->b:Ljava/lang/Object;

    .line 184
    return-void
.end method
