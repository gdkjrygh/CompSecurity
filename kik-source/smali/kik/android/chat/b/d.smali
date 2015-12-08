.class public final Lkik/android/chat/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/b/d$1;,
        Lkik/android/chat/b/d$a;
    }
.end annotation


# static fields
.field public static final a:I

.field private static final e:Lcom/kik/n/a/k/a$a;


# instance fields
.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/HashMap;

.field private final f:Lkik/android/chat/b/b;

.field private final g:Lkik/android/chat/b/b;

.field private h:Lkik/android/chat/b/b;

.field private i:Lkik/android/chat/b/b;

.field private final j:Lkik/android/chat/a/a;

.field private k:Lkik/a/e/v;

.field private final l:Landroid/content/res/ColorStateList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lkik/android/chat/b/d;->a:I

    .line 112
    sget-object v0, Lcom/kik/n/a/k/a$a;->g:Lcom/kik/n/a/k/a$a;

    sput-object v0, Lkik/android/chat/b/d;->e:Lcom/kik/n/a/k/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkik/android/chat/a/a;Lkik/a/e/v;)V
    .locals 12

    .prologue
    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const/16 v0, 0xb

    new-array v0, v0, [Lkik/android/chat/b/b;

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->l:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f09007e

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->l:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v2, v0, v7

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->m:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f09007d

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->m:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v2, v0, v6

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->n:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f09007b

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->n:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v2, v0, v10

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->o:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f09007f

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->o:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v2, v0, v11

    const/4 v2, 0x4

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->p:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090077

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->p:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/4 v2, 0x5

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->q:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090076

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->q:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/4 v2, 0x6

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->r:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09007a

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->r:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/4 v2, 0x7

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->s:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090080

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->s:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/16 v2, 0x8

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->t:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09007c

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->t:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/16 v2, 0x9

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->u:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090078

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->u:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    const/16 v2, 0xa

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->v:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090079

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->v:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->a:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    aput-object v3, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->b:Ljava/util/List;

    .line 86
    const/16 v0, 0xb

    new-array v0, v0, [Lkik/android/chat/b/b;

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->a:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f090073

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->a:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v2}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v2

    aput-object v2, v0, v7

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->b:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f090072

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->b:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v2}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v2

    aput-object v2, v0, v6

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->c:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f090070

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->c:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v2}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v2

    aput-object v2, v0, v10

    new-instance v2, Lkik/android/chat/b/b;

    sget-object v3, Lcom/kik/n/a/k/a$a;->d:Lcom/kik/n/a/k/a$a;

    const v4, 0x7f090074

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/chat/b/d$a;->d:Lkik/android/chat/b/d$a;

    sget v8, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v2, v3, v4, v5, v8}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v2}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v2

    aput-object v2, v0, v11

    const/4 v2, 0x4

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->e:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09006b

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->e:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x5

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->f:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09006d

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->f:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x6

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->g:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09006f

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->g:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x7

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->h:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090075

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->h:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0x8

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->i:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f090071

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->i:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0x9

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->j:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09006c

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->j:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0xa

    new-instance v3, Lkik/android/chat/b/b;

    sget-object v4, Lcom/kik/n/a/k/a$a;->k:Lcom/kik/n/a/k/a$a;

    const v5, 0x7f09006e

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkik/android/chat/b/d$a;->k:Lkik/android/chat/b/d$a;

    sget v9, Lkik/android/chat/b/b$a;->b:I

    invoke-direct {v3, v4, v5, v8, v9}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V

    invoke-virtual {v3}, Lkik/android/chat/b/b;->f()Lkik/android/chat/b/b;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->c:Ljava/util/List;

    .line 100
    new-instance v0, Lkik/android/chat/b/e;

    invoke-direct {v0, p0}, Lkik/android/chat/b/e;-><init>(Lkik/android/chat/b/d;)V

    iput-object v0, p0, Lkik/android/chat/b/d;->d:Ljava/util/HashMap;

    .line 114
    new-instance v0, Lkik/android/chat/b/b;

    const-string v2, "White"

    sget v4, Lkik/android/chat/b/b$a;->b:I

    const-string v5, "Incoming White"

    move-object v3, v1

    invoke-direct/range {v0 .. v5}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;ILjava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/b/d;->f:Lkik/android/chat/b/b;

    .line 115
    new-instance v0, Lkik/android/chat/b/b;

    const-string v2, "classic photo"

    sget v4, Lkik/android/chat/b/b$a;->a:I

    const-string v5, "Classic Photo"

    move-object v3, v1

    invoke-direct/range {v0 .. v5}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;ILjava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/b/d;->g:Lkik/android/chat/b/b;

    .line 118
    sget-object v0, Lkik/android/chat/b/d;->e:Lcom/kik/n/a/k/a$a;

    invoke-direct {p0, v0}, Lkik/android/chat/b/d;->a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->i:Lkik/android/chat/b/b;

    .line 126
    iput-object p2, p0, Lkik/android/chat/b/d;->j:Lkik/android/chat/a/a;

    .line 127
    iput-object p3, p0, Lkik/android/chat/b/d;->k:Lkik/a/e/v;

    .line 129
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->l:Landroid/content/res/ColorStateList;

    .line 130
    invoke-direct {p0}, Lkik/android/chat/b/d;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    move v0, v6

    :goto_0
    if-eqz v0, :cond_1

    .line 131
    invoke-direct {p0}, Lkik/android/chat/b/d;->f()Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lkik/android/chat/b/d;->e:Lcom/kik/n/a/k/a$a;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/b/d;->d:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/k/a$a;

    :cond_0
    invoke-direct {p0, v0}, Lkik/android/chat/b/d;->a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/b/d;->a(Lkik/android/chat/b/b;)V

    invoke-virtual {p0}, Lkik/android/chat/b/d;->a()Z

    iget-object v0, p0, Lkik/android/chat/b/d;->k:Lkik/a/e/v;

    const-string v1, "kik.chat.bubble.color"

    invoke-interface {v0, v1}, Lkik/a/e/v;->q(Ljava/lang/String;)Z

    .line 133
    :cond_1
    iget-object v0, p0, Lkik/android/chat/b/d;->j:Lkik/android/chat/a/a;

    invoke-virtual {v0}, Lkik/android/chat/a/a;->b()Lcom/kik/n/a/k/a$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/b/d;->a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    .line 135
    iget-object v0, p0, Lkik/android/chat/b/d;->j:Lkik/android/chat/a/a;

    invoke-virtual {v0}, Lkik/android/chat/a/a;->d()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/b/f;

    invoke-direct {v1, p0}, Lkik/android/chat/b/f;-><init>(Lkik/android/chat/b/d;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 145
    return-void

    :cond_2
    move v0, v7

    .line 130
    goto :goto_0
.end method

.method private a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;
    .locals 3

    .prologue
    .line 219
    iget-object v0, p0, Lkik/android/chat/b/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/b/b;

    .line 220
    invoke-virtual {v0}, Lkik/android/chat/b/b;->d()Lcom/kik/n/a/k/a$a;

    move-result-object v2

    if-ne v2, p1, :cond_0

    .line 229
    :goto_0
    return-object v0

    .line 224
    :cond_1
    iget-object v0, p0, Lkik/android/chat/b/d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/b/b;

    .line 225
    invoke-virtual {v0}, Lkik/android/chat/b/b;->d()Lcom/kik/n/a/k/a$a;

    move-result-object v2

    if-ne v2, p1, :cond_2

    goto :goto_0

    .line 229
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/b/d;Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lkik/android/chat/b/d;->a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/b/d;Lkik/android/chat/b/b;)Lkik/android/chat/b/b;
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    return-object p1
.end method

.method private f()Ljava/lang/String;
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lkik/android/chat/b/d;->k:Lkik/a/e/v;

    const-string v1, "kik.chat.bubble.color"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)Ljava/util/List;
    .locals 2

    .prologue
    .line 166
    sget-object v0, Lkik/android/chat/b/d$1;->a:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 179
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1

    .line 169
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/b/d;->b:Ljava/util/List;

    goto :goto_0

    .line 172
    :pswitch_1
    iget-object v0, p0, Lkik/android/chat/b/d;->c:Ljava/util/List;

    goto :goto_0

    .line 166
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Lkik/android/chat/b/b;)V
    .locals 1

    .prologue
    .line 211
    if-nez p1, :cond_0

    .line 215
    :goto_0
    return-void

    .line 214
    :cond_0
    invoke-virtual {p1}, Lkik/android/chat/b/b;->d()Lcom/kik/n/a/k/a$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/b/d;->a(Lcom/kik/n/a/k/a$a;)Lkik/android/chat/b/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    goto :goto_0
.end method

.method public final a()Z
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    if-nez v0, :cond_0

    sget-object v0, Lkik/android/chat/b/d;->e:Lcom/kik/n/a/k/a$a;

    .line 157
    :goto_0
    iget-object v1, p0, Lkik/android/chat/b/d;->j:Lkik/android/chat/a/a;

    invoke-virtual {v1}, Lkik/android/chat/a/a;->b()Lcom/kik/n/a/k/a$a;

    move-result-object v1

    if-eq v1, v0, :cond_1

    .line 158
    iget-object v1, p0, Lkik/android/chat/b/d;->j:Lkik/android/chat/a/a;

    invoke-virtual {v1, v0}, Lkik/android/chat/a/a;->a(Lcom/kik/n/a/k/a$a;)V

    .line 159
    const/4 v0, 0x1

    .line 161
    :goto_1
    return v0

    .line 155
    :cond_0
    iget-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->d()Lcom/kik/n/a/k/a$a;

    move-result-object v0

    goto :goto_0

    .line 161
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b()Landroid/content/res/ColorStateList;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lkik/android/chat/b/d;->l:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final c()Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/b/d;->i:Lkik/android/chat/b/b;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/b/d;->h:Lkik/android/chat/b/b;

    goto :goto_0
.end method

.method public final d()Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lkik/android/chat/b/d;->g:Lkik/android/chat/b/b;

    return-object v0
.end method

.method public final e()Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lkik/android/chat/b/d;->f:Lkik/android/chat/b/b;

    return-object v0
.end method
