.class public final Lcom/kik/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/e/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/e/b$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private A:La/a;

.field private B:Ljavax/inject/Provider;

.field private C:Ljavax/inject/Provider;

.field private D:La/a;

.field private E:Ljavax/inject/Provider;

.field private F:La/a;

.field private G:La/a;

.field private H:Ljavax/inject/Provider;

.field private I:La/a;

.field private J:Ljavax/inject/Provider;

.field private K:La/a;

.field private L:La/a;

.field private M:La/a;

.field private N:La/a;

.field private O:La/a;

.field private P:La/a;

.field private Q:Ljavax/inject/Provider;

.field private R:La/a;

.field private S:La/a;

.field private T:La/a;

.field private U:La/a;

.field private V:La/a;

.field private W:La/a;

.field private X:La/a;

.field private Y:La/a;

.field private Z:La/a;

.field private aA:La/a;

.field private aB:La/a;

.field private aC:La/a;

.field private aD:La/a;

.field private aE:Ljavax/inject/Provider;

.field private aF:Ljavax/inject/Provider;

.field private aG:Ljavax/inject/Provider;

.field private aH:Ljavax/inject/Provider;

.field private aI:Ljavax/inject/Provider;

.field private aJ:Ljavax/inject/Provider;

.field private aK:La/a;

.field private aL:La/a;

.field private aM:La/a;

.field private aN:La/a;

.field private aO:La/a;

.field private aP:Ljavax/inject/Provider;

.field private aQ:La/a;

.field private aR:La/a;

.field private aS:La/a;

.field private aT:La/a;

.field private aU:La/a;

.field private aV:La/a;

.field private aW:La/a;

.field private aX:La/a;

.field private aY:La/a;

.field private aZ:La/a;

.field private aa:Ljavax/inject/Provider;

.field private ab:La/a;

.field private ac:La/a;

.field private ad:La/a;

.field private ae:Ljavax/inject/Provider;

.field private af:La/a;

.field private ag:Ljavax/inject/Provider;

.field private ah:La/a;

.field private ai:Ljavax/inject/Provider;

.field private aj:Ljavax/inject/Provider;

.field private ak:La/a;

.field private al:La/a;

.field private am:La/a;

.field private an:La/a;

.field private ao:La/a;

.field private ap:La/a;

.field private aq:La/a;

.field private ar:Ljavax/inject/Provider;

.field private as:Ljavax/inject/Provider;

.field private at:Ljavax/inject/Provider;

.field private au:Ljavax/inject/Provider;

.field private av:Ljavax/inject/Provider;

.field private aw:La/a;

.field private ax:Ljavax/inject/Provider;

.field private ay:La/a;

.field private az:La/a;

.field private b:Ljavax/inject/Provider;

.field private ba:La/a;

.field private bb:La/a;

.field private bc:La/a;

.field private bd:La/a;

.field private be:La/a;

.field private bf:La/a;

.field private bg:La/a;

.field private bh:La/a;

.field private bi:La/a;

.field private bj:La/a;

.field private bk:La/a;

.field private bl:La/a;

.field private c:La/a;

.field private d:Ljavax/inject/Provider;

.field private e:La/a;

.field private f:Ljavax/inject/Provider;

.field private g:La/a;

.field private h:Ljavax/inject/Provider;

.field private i:La/a;

.field private j:La/a;

.field private k:Ljavax/inject/Provider;

.field private l:La/a;

.field private m:La/a;

.field private n:Ljavax/inject/Provider;

.field private o:La/a;

.field private p:Ljavax/inject/Provider;

.field private q:La/a;

.field private r:La/a;

.field private s:Ljavax/inject/Provider;

.field private t:Ljavax/inject/Provider;

.field private u:La/a;

.field private v:La/a;

.field private w:La/a;

.field private x:La/a;

.field private y:La/a;

.field private z:Ljavax/inject/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 247
    const-class v0, Lcom/kik/e/b;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/kik/e/b;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/kik/e/b$a;)V
    .locals 23

    .prologue
    .line 365
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 366
    sget-boolean v1, Lcom/kik/e/b;->a:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 367
    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/u;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/pk;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->c:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->b(Lcom/kik/e/b$a;)Lcom/kik/j/a;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/b;->a(Lcom/kik/j/a;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->d:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->d:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/e;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->e:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->c(Lcom/kik/e/b$a;)Lcom/kik/j/e;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/f;->a(Lcom/kik/j/e;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/sd;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->g:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->d(Lcom/kik/e/b$a;)Lcom/kik/j/o;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/p;->a(Lcom/kik/j/o;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lcom/kik/cards/browser/e;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->i:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/i/k;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->j:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->e(Lcom/kik/e/b$a;)Lcom/kik/j/g;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/j;->a(Lcom/kik/j/g;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->k:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->k:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4, v5}, Lkik/android/widget/ar;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->l:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->k:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/widget/bx;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->m:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/i;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/widget/bw;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->o:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/l;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/rk;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->q:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/activity/j;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->r:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/j;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/m;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->t:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->t:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/net/communicator/i;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->u:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/activity/al;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->v:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->t:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/activity/o;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->w:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->w:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/activity/aj;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->x:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/activity/f;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->y:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->e(Lcom/kik/e/b$a;)Lcom/kik/j/g;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/h;->a(Lcom/kik/j/g;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/eq;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->A:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/n;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/q;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->x:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4, v5}, Lkik/android/chat/activity/ab;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->D:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/s;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->E:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->E:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4, v5}, Lcom/kik/view/adapters/at;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->F:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/ak;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->G:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/h;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->H:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->H:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/v;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->I:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/w;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->I:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/g;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->K:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->H:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/l;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->L:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->L:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/preferences/bf;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->M:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->H:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/i;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->N:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->N:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/az;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->O:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->H:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/ac;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->P:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->e(Lcom/kik/e/b$a;)Lcom/kik/j/g;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/i;->a(Lcom/kik/j/g;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/widget/preferences/bm;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->R:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->S:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->I:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/widget/preferences/br;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->T:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->L:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/preferences/at;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->U:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/preferences/b;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->V:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/preferences/aj;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->W:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/widget/preferences/ah;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->X:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->Y:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->L:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/widget/preferences/r;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->Z:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/e;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aa:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->aa:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/aq;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ab:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->p:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bj;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ac:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/mc;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->f(Lcom/kik/e/b$a;)Lcom/kik/j/u;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/v;->a(Lcom/kik/j/u;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/settings/h;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->af:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->g(Lcom/kik/e/b$a;)Lcom/kik/j/aa;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/ab;->a(Lcom/kik/j/aa;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ag:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->af:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->ag:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/settings/c;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ah:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/v;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/p;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ah:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4, v5}, Lkik/android/chat/fragment/ob;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ak:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bl;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->al:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->aa:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bc;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->am:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bk;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->an:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bn;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ao:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->P:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/widget/preferences/bo;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ap:La/a;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v6}, Lkik/android/af;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aq:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->h(Lcom/kik/e/b$a;)Lcom/kik/j/w;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/x;->a(Lcom/kik/j/w;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ar:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->i(Lcom/kik/e/b$a;)Lcom/kik/j/c;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/d;->a(Lcom/kik/j/c;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->j(Lcom/kik/e/b$a;)Lcom/kik/j/y;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/z;->a(Lcom/kik/j/y;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->k(Lcom/kik/e/b$a;)Lcom/kik/j/k;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/l;->a(Lcom/kik/j/k;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->au:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->l(Lcom/kik/e/b$a;)Lcom/kik/j/m;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/n;->a(Lcom/kik/j/m;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->av:Ljavax/inject/Provider;

    invoke-static {}, La/a/b;->a()La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->ar:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->au:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->av:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->d:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v9}, Lkik/android/chat/aj;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aw:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/k;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ax:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->E:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->ax:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v10}, Lkik/android/chat/fragment/mk;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ay:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/f;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->az:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/aa;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aA:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/ac;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aB:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v8}, Lkik/android/chat/fragment/ar;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aC:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/bd;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aD:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/r;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aE:Ljavax/inject/Provider;

    .line 368
    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/t;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aF:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/f;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aG:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/g;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aH:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->a(Lcom/kik/e/b$a;)Lkik/a/d;

    move-result-object v1

    invoke-static {v1}, Lkik/a/o;->a(Lkik/a/d;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aI:Ljavax/inject/Provider;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->m(Lcom/kik/e/b$a;)Lcom/kik/j/q;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/r;->a(Lcom/kik/j/q;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aJ:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->aE:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->aF:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->ar:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->aG:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->aH:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->aI:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kik/e/b;->aJ:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    move-object/from16 v16, v0

    invoke-static/range {v1 .. v16}, Lcom/kik/cards/web/ao;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aK:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aK:La/a;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aL:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aL:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/bq;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aM:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/bv;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aN:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->k:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->E:Ljavax/inject/Provider;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->ar:Ljavax/inject/Provider;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->ag:Ljavax/inject/Provider;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->au:Ljavax/inject/Provider;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kik/e/b;->av:Ljavax/inject/Provider;

    move-object/from16 v22, v0

    invoke-static/range {v1 .. v22}, Lkik/android/chat/fragment/gg;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aO:La/a;

    invoke-static/range {p1 .. p1}, Lcom/kik/e/b$a;->n(Lcom/kik/e/b$a;)Lcom/kik/j/s;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/j/t;->a(Lcom/kik/j/s;)La/a/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aP:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->az:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->aP:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v9}, Lkik/android/chat/fragment/ic;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aQ:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v6}, Lkik/android/chat/fragment/jn;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aR:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aC:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->aa:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->d:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->aJ:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v9}, Lkik/android/chat/fragment/kr;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aS:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aR:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/lb;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aT:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->at:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/po;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aU:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aU:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/lg;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aV:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v6}, Lkik/android/chat/fragment/lv;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aW:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->az:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/le;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aX:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aR:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/ne;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aY:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->z:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4, v5}, Lkik/android/chat/fragment/ni;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->aZ:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aT:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/nn;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->ba:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aY:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/nq;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bb:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aU:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/oj;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bc:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->E:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->n:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->ax:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v10}, Lkik/android/chat/fragment/pg;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bd:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->bb:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v9}, Lkik/android/chat/fragment/py;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->be:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->ae:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/qd;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bf:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->aC:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static {v1, v2}, Lkik/android/chat/fragment/qk;->a(La/a;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bg:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v8}, Lkik/android/chat/fragment/rg;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bh:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->k:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->aj:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->f:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v10}, Lkik/android/chat/fragment/to;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bi:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->Q:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->ai:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->b:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->J:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/kik/e/b;->aP:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v10}, Lkik/android/chat/fragment/iz;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bj:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->ad:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->as:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/e/b;->C:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/e/b;->aP:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/e/b;->s:Ljavax/inject/Provider;

    invoke-static/range {v1 .. v7}, Lkik/android/scan/fragment/w;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bk:La/a;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/kik/e/b;->c:La/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/e/b;->h:Ljavax/inject/Provider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/e/b;->B:Ljavax/inject/Provider;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/qw;->a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/kik/e/b;->bl:La/a;

    .line 369
    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/e/b$a;B)V
    .locals 0

    .prologue
    .line 248
    invoke-direct {p0, p1}, Lcom/kik/e/b;-><init>(Lcom/kik/e/b$a;)V

    return-void
.end method

.method public static a()Lcom/kik/e/b$a;
    .locals 2

    .prologue
    .line 372
    new-instance v0, Lcom/kik/e/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kik/e/b$a;-><init>(B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 1

    .prologue
    .line 508
    iget-object v0, p0, Lcom/kik/e/b;->i:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 509
    return-void
.end method

.method public final a(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 1

    .prologue
    .line 768
    iget-object v0, p0, Lcom/kik/e/b;->aK:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 769
    return-void
.end method

.method public final a(Lcom/kik/view/adapters/ar;)V
    .locals 1

    .prologue
    .line 578
    iget-object v0, p0, Lcom/kik/e/b;->F:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 579
    return-void
.end method

.method public final a(Lkik/android/KikNotificationHandler;)V
    .locals 1

    .prologue
    .line 708
    iget-object v0, p0, Lcom/kik/e/b;->aq:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 709
    return-void
.end method

.method public final a(Lkik/android/chat/KikApplication;)V
    .locals 1

    .prologue
    .line 713
    iget-object v0, p0, Lcom/kik/e/b;->aw:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 714
    return-void
.end method

.method public final a(Lkik/android/chat/activity/FragmentWrapperActivity;)V
    .locals 1

    .prologue
    .line 563
    iget-object v0, p0, Lcom/kik/e/b;->y:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 564
    return-void
.end method

.method public final a(Lkik/android/chat/activity/IntroActivity;)V
    .locals 1

    .prologue
    .line 538
    iget-object v0, p0, Lcom/kik/e/b;->r:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 539
    return-void
.end method

.method public final a(Lkik/android/chat/activity/KikActivityBase;)V
    .locals 1

    .prologue
    .line 553
    iget-object v0, p0, Lcom/kik/e/b;->w:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 554
    return-void
.end method

.method public final a(Lkik/android/chat/activity/KikApiLandingActivity;)V
    .locals 1

    .prologue
    .line 573
    iget-object v0, p0, Lcom/kik/e/b;->D:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 574
    return-void
.end method

.method public final a(Lkik/android/chat/activity/KikIqActivityBase;)V
    .locals 1

    .prologue
    .line 558
    iget-object v0, p0, Lcom/kik/e/b;->x:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 559
    return-void
.end method

.method public final a(Lkik/android/chat/activity/KikPlatformLanding;)V
    .locals 1

    .prologue
    .line 548
    iget-object v0, p0, Lcom/kik/e/b;->v:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 549
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/AbTestsFragment;)V
    .locals 1

    .prologue
    .line 498
    iget-object v0, p0, Lcom/kik/e/b;->e:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 499
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/BaseChatInfoFragment;)V
    .locals 1

    .prologue
    .line 723
    iget-object v0, p0, Lcom/kik/e/b;->az:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 724
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 1

    .prologue
    .line 728
    iget-object v0, p0, Lcom/kik/e/b;->aA:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 729
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/ChatBubbleSelectionFragment;)V
    .locals 1

    .prologue
    .line 738
    iget-object v0, p0, Lcom/kik/e/b;->aB:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 739
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/ConversationsBaseFragment;)V
    .locals 1

    .prologue
    .line 743
    iget-object v0, p0, Lcom/kik/e/b;->aC:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 744
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikAddContactFragment;)V
    .locals 1

    .prologue
    .line 748
    iget-object v0, p0, Lcom/kik/e/b;->aD:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 749
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikCardBrowserFragment;)V
    .locals 1

    .prologue
    .line 753
    iget-object v0, p0, Lcom/kik/e/b;->aM:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 754
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V
    .locals 1

    .prologue
    .line 758
    iget-object v0, p0, Lcom/kik/e/b;->aN:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 759
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 1

    .prologue
    .line 763
    iget-object v0, p0, Lcom/kik/e/b;->aO:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 764
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 1

    .prologue
    .line 778
    iget-object v0, p0, Lcom/kik/e/b;->aQ:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 779
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 1

    .prologue
    .line 878
    iget-object v0, p0, Lcom/kik/e/b;->bj:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 879
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikContactsListFragment;)V
    .locals 1

    .prologue
    .line 783
    iget-object v0, p0, Lcom/kik/e/b;->aR:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 784
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 1

    .prologue
    .line 788
    iget-object v0, p0, Lcom/kik/e/b;->aS:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 789
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V
    .locals 1

    .prologue
    .line 793
    iget-object v0, p0, Lcom/kik/e/b;->aT:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 794
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V
    .locals 1

    .prologue
    .line 808
    iget-object v0, p0, Lcom/kik/e/b;->aX:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 809
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikFindPeopleFragment;)V
    .locals 1

    .prologue
    .line 798
    iget-object v0, p0, Lcom/kik/e/b;->aV:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 799
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 1

    .prologue
    .line 803
    iget-object v0, p0, Lcom/kik/e/b;->aW:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 804
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikIqFragmentBase;)V
    .locals 1

    .prologue
    .line 773
    iget-object v0, p0, Lcom/kik/e/b;->ad:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 774
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikLoginFragment;)V
    .locals 1

    .prologue
    .line 718
    iget-object v0, p0, Lcom/kik/e/b;->ay:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 719
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V
    .locals 1

    .prologue
    .line 813
    iget-object v0, p0, Lcom/kik/e/b;->aY:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 814
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikPermissionsFragment;)V
    .locals 1

    .prologue
    .line 818
    iget-object v0, p0, Lcom/kik/e/b;->aZ:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 819
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikPickContactFragment;)V
    .locals 1

    .prologue
    .line 823
    iget-object v0, p0, Lcom/kik/e/b;->ba:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 824
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikPickUsersFragment;)V
    .locals 1

    .prologue
    .line 828
    iget-object v0, p0, Lcom/kik/e/b;->bb:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 829
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V
    .locals 1

    .prologue
    .line 678
    iget-object v0, p0, Lcom/kik/e/b;->ak:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 679
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V
    .locals 1

    .prologue
    .line 833
    iget-object v0, p0, Lcom/kik/e/b;->bc:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 834
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 1

    .prologue
    .line 838
    iget-object v0, p0, Lcom/kik/e/b;->bd:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 839
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 1

    .prologue
    .line 733
    iget-object v0, p0, Lcom/kik/e/b;->c:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 734
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)V
    .locals 1

    .prologue
    .line 843
    iget-object v0, p0, Lcom/kik/e/b;->aU:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 844
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikStartGroupFragment;)V
    .locals 1

    .prologue
    .line 848
    iget-object v0, p0, Lcom/kik/e/b;->be:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 849
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikWelcomeFragment;)V
    .locals 1

    .prologue
    .line 853
    iget-object v0, p0, Lcom/kik/e/b;->bf:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 854
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/MissedConversationsFragment;)V
    .locals 1

    .prologue
    .line 858
    iget-object v0, p0, Lcom/kik/e/b;->bg:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 859
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 1

    .prologue
    .line 888
    iget-object v0, p0, Lcom/kik/e/b;->bl:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 889
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/SendToFragment;)V
    .locals 1

    .prologue
    .line 863
    iget-object v0, p0, Lcom/kik/e/b;->bh:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 864
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)V
    .locals 1

    .prologue
    .line 533
    iget-object v0, p0, Lcom/kik/e/b;->q:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 534
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/VideoTrimmingFragment;)V
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lcom/kik/e/b;->g:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 504
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 1

    .prologue
    .line 873
    iget-object v0, p0, Lcom/kik/e/b;->bi:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 874
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V
    .locals 1

    .prologue
    .line 868
    iget-object v0, p0, Lcom/kik/e/b;->ah:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 869
    return-void
.end method

.method public final a(Lkik/android/i/i;)V
    .locals 1

    .prologue
    .line 513
    iget-object v0, p0, Lcom/kik/e/b;->j:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 514
    return-void
.end method

.method public final a(Lkik/android/net/communicator/CommunicatorService;)V
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lcom/kik/e/b;->u:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 544
    return-void
.end method

.method public final a(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    .line 883
    iget-object v0, p0, Lcom/kik/e/b;->bk:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 884
    return-void
.end method

.method public final a(Lkik/android/widget/GalleryWidget;)V
    .locals 1

    .prologue
    .line 518
    iget-object v0, p0, Lcom/kik/e/b;->l:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 519
    return-void
.end method

.method public final a(Lkik/android/widget/GifWidget;)V
    .locals 1

    .prologue
    .line 523
    iget-object v0, p0, Lcom/kik/e/b;->m:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 524
    return-void
.end method

.method public final a(Lkik/android/widget/GifWidgetFragment;)V
    .locals 1

    .prologue
    .line 528
    iget-object v0, p0, Lcom/kik/e/b;->o:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 529
    return-void
.end method

.method public final a(Lkik/android/widget/WebTrayWidget;)V
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/kik/e/b;->A:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 569
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/AutoplayVideoPreference;)V
    .locals 1

    .prologue
    .line 623
    iget-object v0, p0, Lcom/kik/e/b;->V:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 624
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/HelpPreference;)V
    .locals 1

    .prologue
    .line 588
    iget-object v0, p0, Lcom/kik/e/b;->K:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 589
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikCheckBoxPreference;)V
    .locals 1

    .prologue
    .line 653
    iget-object v0, p0, Lcom/kik/e/b;->N:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 654
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikEditTextPreference;)V
    .locals 1

    .prologue
    .line 648
    iget-object v0, p0, Lcom/kik/e/b;->L:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 649
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikEmailPreference;)V
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Lcom/kik/e/b;->Z:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 644
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikModalPreference;)V
    .locals 1

    .prologue
    .line 658
    iget-object v0, p0, Lcom/kik/e/b;->I:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 659
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikPreference;)V
    .locals 1

    .prologue
    .line 663
    iget-object v0, p0, Lcom/kik/e/b;->P:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 664
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikPreferenceScreen;)V
    .locals 1

    .prologue
    .line 638
    iget-object v0, p0, Lcom/kik/e/b;->Y:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 639
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikProfilePicPreference;)V
    .locals 1

    .prologue
    .line 633
    iget-object v0, p0, Lcom/kik/e/b;->X:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 634
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikVideoPrefetchPreference;)V
    .locals 1

    .prologue
    .line 628
    iget-object v0, p0, Lcom/kik/e/b;->W:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 629
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/LEDNotificationPreference;)V
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/kik/e/b;->G:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 584
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/MatchingPreference;)V
    .locals 1

    .prologue
    .line 668
    iget-object v0, p0, Lcom/kik/e/b;->ab:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 669
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/NamePreference;)V
    .locals 1

    .prologue
    .line 618
    iget-object v0, p0, Lcom/kik/e/b;->U:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 619
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V
    .locals 1

    .prologue
    .line 598
    iget-object v0, p0, Lcom/kik/e/b;->O:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 599
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/OptOutPreference;)V
    .locals 1

    .prologue
    .line 688
    iget-object v0, p0, Lcom/kik/e/b;->am:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 689
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/PasswordPreference;)V
    .locals 1

    .prologue
    .line 593
    iget-object v0, p0, Lcom/kik/e/b;->M:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 594
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ResetKikPreference;)V
    .locals 1

    .prologue
    .line 673
    iget-object v0, p0, Lcom/kik/e/b;->ac:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 674
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShareEmailPreference;)V
    .locals 1

    .prologue
    .line 693
    iget-object v0, p0, Lcom/kik/e/b;->an:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 694
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShareOtherPreference;)V
    .locals 1

    .prologue
    .line 683
    iget-object v0, p0, Lcom/kik/e/b;->al:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 684
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShareProfilePreference;)V
    .locals 1

    .prologue
    .line 603
    iget-object v0, p0, Lcom/kik/e/b;->R:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 604
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShareSmsPreference;)V
    .locals 1

    .prologue
    .line 698
    iget-object v0, p0, Lcom/kik/e/b;->ao:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 699
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShareSocialPreference;)V
    .locals 1

    .prologue
    .line 703
    iget-object v0, p0, Lcom/kik/e/b;->ap:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 704
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/ShowKikCodePreference;)V
    .locals 1

    .prologue
    .line 608
    iget-object v0, p0, Lcom/kik/e/b;->S:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 609
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/UsernamePreference;)V
    .locals 1

    .prologue
    .line 613
    iget-object v0, p0, Lcom/kik/e/b;->T:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    .line 614
    return-void
.end method
