.class public final Lcom/roidapp/photogrid/common/cc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->d:Ljava/lang/String;

    .line 18
    iput-object p1, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    .line 19
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/cc;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 28
    .line 1055
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1056
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1057
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1058
    const-string v2, "http://market.android.com/details?id=com.roidapp.photogrid"

    iput-object v2, p0, Lcom/roidapp/photogrid/common/cc;->d:Ljava/lang/String;

    .line 1059
    const-string v2, "en"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 1063
    const-string v2, "ar"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1064
    const-string v0, "\u0639\u0632\u064a\u0632\u064a \u0627\u0644\u0645\u0633\u062a\u062e\u062f\u0645"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1065
    const-string v0, "\u0645\u0644\u0641 \u0645\u0639\u0637\u0648\u0628\u060c \u0627\u0644\u0631\u062c\u0627\u0621 \u0625\u0639\u0627\u062f\u0629 \u062a\u062b\u0628\u064a\u062a \u0627\u0644\u062a\u0637\u0628\u064a\u0642 \u0645\u0646 Google Play"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1066
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    .line 29
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 30
    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 31
    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 32
    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    new-instance v2, Lcom/roidapp/photogrid/common/cd;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/common/cd;-><init>(Lcom/roidapp/photogrid/common/cc;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 42
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 43
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 52
    :goto_1
    return-void

    .line 1067
    :cond_0
    const-string v2, "de"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1068
    const-string v0, "Sehr geehrter Nutzer"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1069
    const-string v0, "Datei besch\u00e4digt, Bitte installieren Sie die App von Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1070
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 46
    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_1

    .line 1071
    :cond_1
    :try_start_1
    const-string v2, "es"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1072
    const-string v0, "Estimado usuario"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1073
    const-string v0, "Archivo da\u00f1ado, vuelva a instalar la aplicaci\u00f3n desde Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1074
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;
    :try_end_1
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 48
    :catch_1
    move-exception v0

    .line 49
    iget-object v1, p0, Lcom/roidapp/photogrid/common/cc;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 1075
    :cond_2
    :try_start_2
    const-string v2, "fr"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1076
    const-string v0, "Cher utilisateur"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1077
    const-string v0, "Fichier corrompu, veuillez r\u00e9installer l\'application \u00e0 pratir de Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1078
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto :goto_0

    .line 1079
    :cond_3
    const-string v2, "ja"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1080
    const-string v0, "\u30e6\u30fc\u30b6\u30fc\u5404\u4f4d"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1081
    const-string v0, "\u7834\u640d\u3057\u305f\u30d5\u30a1\u30a4\u30eb\u306f\u3001Google Play \u304b\u3089\u30a2\u30d7\u30ea\u3092\u518d\u30a4\u30f3\u30b9\u30c8\u30fc\u30eb\u3057\u3066\u304f\u3060\u3055\u3044\u3002"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1082
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1083
    :cond_4
    const-string v2, "ko"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1084
    const-string v0, "\uc0ac\uc6a9\uc790\ub2d8\uaed8"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1085
    const-string v0, "\uc190\uc0c1\ub41c \ud30c\uc77c, \uc560\ud50c\ub9ac\ucf00\uc774\uc158\uc744\uc5d0\uc11c \ub2e4\uc2dc \uc124\uce58\ud558\uc2ed\uc2dc\uc624 Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1086
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1087
    :cond_5
    const-string v2, "ru"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1088
    const-string v0, "\u0423\u0432\u0430\u0436\u0430\u0435\u043c\u044b\u0439 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1089
    const-string v0, "\u0424\u0430\u0439\u043b \u043f\u043e\u0432\u0440\u0435\u0436\u0434\u0435\u043d, \u043f\u043e\u0436\u0430\u043b\u0443\u0439\u0441\u0442\u0430, \u043f\u0435\u0440\u0435\u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u0438\u0437 Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1090
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1091
    :cond_6
    const-string v2, "th"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1092
    const-string v0, "\u0e40\u0e23\u0e35\u0e22\u0e19\u0e1c\u0e39\u0e49\u0e43\u0e0a\u0e49"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1093
    const-string v0, "\u0e22\u0e37\u0e48\u0e19\u0e40\u0e2a\u0e35\u0e22\u0e2b\u0e32\u0e22\u0e01\u0e23\u0e38\u0e13\u0e32\u0e15\u0e34\u0e14\u0e15\u0e31\u0e49\u0e07\u0e15\u0e48\u0e32\u0e07\u0e08\u0e32\u0e01 Google Play."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1094
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1095
    :cond_7
    const-string v2, "tr"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 1096
    const-string v0, "say\u0131n kullan\u0131c\u0131"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1097
    const-string v0, "Dosya zarar g\u00f6rd\u00fc, l\u00fctfen uygulamay\u0131 Google Playden tekrar y\u00fckleyin."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1098
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1099
    :cond_8
    const-string v2, "zh"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "CN"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1100
    const-string v0, "\u4eb2\u7231\u7684\u7528\u6237"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1101
    const-string v0, "\u6587\u4ef6\u635f\u574f\uff0c\u8bf7\u91cd\u65b0\u5b89\u88c5\u5e94\u7528\u7a0b\u5e8f\u4eceGoogle Play\u3002"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1102
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1103
    :cond_9
    const-string v2, "zh"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "TW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1104
    const-string v0, "\u89aa\u611b\u7684\u7528\u6236"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1105
    const-string v0, "\u6587\u4ef6\u640d\u58de\uff0c\u8acb\u5f9eGoogle Play\u91cd\u65b0\u5b89\u88dd\u61c9\u7528\u7a0b\u5e8f\u3002"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1106
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 1108
    :cond_a
    const-string v0, "Dear user"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->a:Ljava/lang/String;

    .line 1109
    const-string v0, "File corrupted, please reinstall the app from Google Play"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->b:Ljava/lang/String;

    .line 1110
    const-string v0, "OK"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/cc;->c:Ljava/lang/String;
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0
.end method
