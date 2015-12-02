.class public Lcom/facebook/user/o;
.super Ljava/lang/Object;
.source "UserBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/user/n;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/user/Name;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Lcom/facebook/user/PicCropInfo;

.field private l:Lcom/facebook/user/PicCropInfo;

.field private m:Ljava/lang/String;

.field private n:F

.field private o:Lcom/facebook/common/w/q;

.field private p:Z

.field private q:Lcom/facebook/user/Birthday;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Lcom/facebook/user/LastActive;

.field private u:Lcom/facebook/user/MobileAppData;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object v0, p0, Lcom/facebook/user/o;->c:Ljava/util/List;

    .line 20
    iput-object v0, p0, Lcom/facebook/user/o;->d:Ljava/util/List;

    .line 31
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/user/o;->o:Lcom/facebook/common/w/q;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/n;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/user/o;->a:Lcom/facebook/user/n;

    return-object v0
.end method

.method public a(F)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 183
    iput p1, p0, Lcom/facebook/user/o;->n:F

    .line 184
    return-object p0
.end method

.method public a(Lcom/facebook/common/w/q;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lcom/facebook/user/o;->o:Lcom/facebook/common/w/q;

    .line 193
    return-object p0
.end method

.method public a(Lcom/facebook/user/Birthday;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/facebook/user/o;->q:Lcom/facebook/user/Birthday;

    .line 210
    return-object p0
.end method

.method public a(Lcom/facebook/user/LastActive;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lcom/facebook/user/o;->t:Lcom/facebook/user/LastActive;

    .line 237
    return-object p0
.end method

.method public a(Lcom/facebook/user/MobileAppData;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/facebook/user/o;->u:Lcom/facebook/user/MobileAppData;

    .line 246
    return-object p0
.end method

.method public a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/user/o;->e:Lcom/facebook/user/Name;

    .line 130
    return-object p0
.end method

.method public a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/facebook/user/o;->k:Lcom/facebook/user/PicCropInfo;

    .line 157
    return-object p0
.end method

.method public a(Lcom/facebook/user/User;)Lcom/facebook/user/o;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p1}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->a:Lcom/facebook/user/n;

    .line 43
    invoke-virtual {p1}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->b:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->c:Ljava/util/List;

    .line 45
    invoke-virtual {p1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->d:Ljava/util/List;

    .line 46
    invoke-virtual {p1}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->e:Lcom/facebook/user/Name;

    .line 47
    invoke-virtual {p1}, Lcom/facebook/user/User;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->j:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->i:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->k:Lcom/facebook/user/PicCropInfo;

    .line 50
    invoke-virtual {p1}, Lcom/facebook/user/User;->t()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->l:Lcom/facebook/user/PicCropInfo;

    .line 51
    invoke-virtual {p1}, Lcom/facebook/user/User;->u()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->m:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lcom/facebook/user/User;->w()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/o;->n:F

    .line 53
    invoke-virtual {p1}, Lcom/facebook/user/User;->x()Lcom/facebook/common/w/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->o:Lcom/facebook/common/w/q;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/user/User;->y()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/user/o;->p:Z

    .line 55
    invoke-virtual {p1}, Lcom/facebook/user/User;->z()Lcom/facebook/user/Birthday;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->q:Lcom/facebook/user/Birthday;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/user/User;->A()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->r:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/user/User;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->s:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->t:Lcom/facebook/user/LastActive;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/user/User;->D()Lcom/facebook/user/MobileAppData;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->u:Lcom/facebook/user/MobileAppData;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/user/User;->E()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->v:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/o;->w:Ljava/lang/String;

    .line 62
    return-object p0
.end method

.method public a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/user/o;->a:Lcom/facebook/user/n;

    .line 75
    iput-object p2, p0, Lcom/facebook/user/o;->b:Ljava/lang/String;

    .line 76
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/user/o;->f:Ljava/lang/String;

    .line 103
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/user/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;)",
            "Lcom/facebook/user/o;"
        }
    .end annotation

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/user/o;->c:Ljava/util/List;

    .line 85
    return-object p0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 201
    iput-boolean p1, p0, Lcom/facebook/user/o;->p:Z

    .line 202
    return-void
.end method

.method public b(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/facebook/user/o;->l:Lcom/facebook/user/PicCropInfo;

    .line 166
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lcom/facebook/user/o;->i:Ljava/lang/String;

    .line 139
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/user/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;)",
            "Lcom/facebook/user/o;"
        }
    .end annotation

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/user/o;->d:Ljava/util/List;

    .line 94
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/user/o;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/facebook/user/o;->j:Ljava/lang/String;

    .line 148
    return-object p0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/user/o;->c:Ljava/util/List;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/facebook/user/o;->r:Ljava/lang/String;

    .line 219
    return-object p0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/user/o;->d:Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lcom/facebook/user/o;->s:Ljava/lang/String;

    .line 228
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/user/o;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/user/o;
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lcom/facebook/user/o;->v:Ljava/lang/String;

    .line 255
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/user/o;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/user/o;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 263
    iput-object p1, p0, Lcom/facebook/user/o;->w:Ljava/lang/String;

    .line 264
    return-void
.end method

.method public h()Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/user/o;->e:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/user/o;->i:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/user/o;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/user/o;->k:Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public l()Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/user/o;->l:Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/user/o;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n()F
    .locals 1

    .prologue
    .line 179
    iget v0, p0, Lcom/facebook/user/o;->n:F

    return v0
.end method

.method public o()Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/user/o;->o:Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public p()Z
    .locals 1

    .prologue
    .line 197
    iget-boolean v0, p0, Lcom/facebook/user/o;->p:Z

    return v0
.end method

.method public q()Lcom/facebook/user/Birthday;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/user/o;->q:Lcom/facebook/user/Birthday;

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/user/o;->r:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lcom/facebook/user/o;->s:Ljava/lang/String;

    return-object v0
.end method

.method public t()Lcom/facebook/user/LastActive;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/user/o;->t:Lcom/facebook/user/LastActive;

    return-object v0
.end method

.method public u()Lcom/facebook/user/MobileAppData;
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/user/o;->u:Lcom/facebook/user/MobileAppData;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/user/o;->v:Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lcom/facebook/user/o;->w:Ljava/lang/String;

    return-object v0
.end method

.method public x()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 267
    new-instance v0, Lcom/facebook/user/User;

    invoke-direct {v0, p0}, Lcom/facebook/user/User;-><init>(Lcom/facebook/user/o;)V

    return-object v0
.end method
