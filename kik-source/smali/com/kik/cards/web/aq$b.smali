.class public final Lcom/kik/cards/web/aq$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 516
    iput-object p1, p0, Lcom/kik/cards/web/aq$b;->a:Ljava/lang/String;

    .line 517
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/aq$b;->b:Z

    .line 518
    iput-boolean p2, p0, Lcom/kik/cards/web/aq$b;->c:Z

    .line 519
    return-void
.end method
